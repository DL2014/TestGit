package com.good;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by dai on 2017/3/15.
 */
public class MyJob implements org.quartz.Job {
    public MyJob(){

    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.err.println("Hello World!  MyJob is executing.");
    }
}
