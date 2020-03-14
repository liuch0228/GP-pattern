package com.gupaoedu.vip.pattern.template.jdbc;

import com.gupaoedu.vip.pattern.template.jdbc.dao.MemberDao;
import org.apache.ibatis.executor.BaseExecutor;

import javax.servlet.http.HttpServlet;
import java.util.AbstractList;
import java.util.List;

public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao(null);
        List<?> result = dao.selectAll();
        System.out.println(result);

        AbstractList abstractList = new AbstractList() {
            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };

    }

    //上面这个 get方法是留给子类去实现的,不同的list的实现,它的get方法的实现逻辑是不同的,在arrayList里面是下面的实现逻辑
    /**
     *      * Returns the element at the specified position in this list.
     *      *
     *      * @param  index index of the element to return
     *      * @return the element at the specified position in this list
     *      * @throws IndexOutOfBoundsException {@inheritDoc}
    public E get(int index) {
     *rangeCheck(index);
     *
     *return elementData(index);
     *}
     */

    //在ArrayQuene中是这样实现的:
    /*
    *     public T get(int i) {
        int size = size();
        if (i < 0 || i >= size) {
            final String msg = "Index " + i + ", queue size " + size;
            throw new IndexOutOfBoundsException(msg);
        }
        int index = (head + i) % capacity;
        return queue[index];
    }
    * */

    HttpServlet servlet =null;
    BaseExecutor executor = null;
    /*
    * BaseExecutor 里面定义了一个模板,下面这四个方法在它的四个子类中进行了不同的实现,可以比较BatchExecutor 和SimpleExecutor中的实现
    * protected abstract int doUpdate(MappedStatement var1, Object var2) throws SQLException;

    protected abstract List<BatchResult> doFlushStatements(boolean var1) throws SQLException;

    protected abstract <E> List<E> doQuery(MappedStatement var1, Object var2, RowBounds var3, ResultHandler var4, BoundSql var5) throws SQLException;

    protected abstract <E> Cursor<E> doQueryCursor(MappedStatement var1, Object var2, RowBounds var3, BoundSql var4) throws SQLException;

    * */

    // 相同的步骤，方法在模板的抽象类里面规定了，子类中会存在不同的部分的方法，留给用户自己去实现！！！

    //org.apache.ibatis.executor.BaseExecutor.doQuery 该方法也是BaseExecutor这个模板中的需要子类自己去实现的方法
// HttpServlet  中也使用了模板方法模式

}
