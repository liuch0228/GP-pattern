package com.gupaoedu.vip.pattern.observer.events;

import com.gupaoedu.vip.pattern.observer.events.mouseevent.Mouse;
import com.gupaoedu.vip.pattern.observer.events.mouseevent.MouseEventCallback;
import com.gupaoedu.vip.pattern.observer.events.mouseevent.MouseEventType;

public class MouseEventTest {
    public static void main(String[] args) {

        Mouse mouse = new Mouse();
        MouseEventCallback callback = new MouseEventCallback();
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.click();

    }
}
