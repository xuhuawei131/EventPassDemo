# EventPassDemo
事件分发的例子

事件分发

Activity       dispatcTouchEvent->
ViewGroup  dispatcTouchEvent-> OnIntercepteTouchEvent->
View           dispatcTouchEvent-> OnTouchEvent

Activity中的dispatcTouchEvent
true 消费掉
false 消费掉
super 传递给下一级(ViewGroup中的dispatcTouchEvent)


ViewGroup中的dispatcTouchEvent
True 消费掉
False 调用上一级的OnTouchEvent
Super 传递给下一级（ OnIntercepteTouchEvent函数）


ViewGroup中的OnIntercepteTouchEvent
true  调用自己的OnTouchEvent
false  传递给下一级（View的 dispatcTouchEvent）
super 传递给下一级（View的 dispatcTouchEvent）

View的 dispatcTouchEvent
true 消费掉
false 调用上一级的OnTouchEvent
super 传递给下一级（ OnTouchEvent函数）


