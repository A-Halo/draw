package com.java.behavioral.State;

public class DeadState extends ThreadState{
    public DeadState(){
        state=StateSet.DEAD;
        System.out.println("结束线程");
    }
    public void stop(ThreadContext tc){
        System.out.println("调用finish方法");
        if (state==StateSet.DEAD){
            tc.setThreadState(new RunnableState());
        }else
            System.out.println("当前线程不是新建状态");
    }
}
