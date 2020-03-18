package com.lchtest.pattern.responsibilitychain.auth.optimize;

import com.lchtest.pattern.responsibilitychain.auth.Member;

/**
 * 用户登录校验- 责任链写法
 */
public class MemberService {

    public void login(String loginName, String loginPass) {
      Handler validateHandler = new ValidateHandler();
      Handler loginHandler = new LoginHandler();
      Handler authHandler = new AuthHandler();
      // 设置责任链关系 这里有个缺点，如果handler的个数非常多，这里就显得很繁琐了，可以采用建造者模式改进
      validateHandler.next(loginHandler);
      loginHandler.next(authHandler);
      validateHandler.doHandler(new Member(loginName,loginPass));
    }
}
