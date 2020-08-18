package org.apache.dolphinscheduler.server.worker.task;

import org.apache.dolphinscheduler.common.Constants;
import org.apache.dolphinscheduler.common.task.AbstractParameters;
import org.apache.dolphinscheduler.server.entity.TaskExecutionContext;
import org.slf4j.Logger;

/**
 * fake-run task
 */
public class FakeRunTask extends AbstractTask {

    public FakeRunTask(TaskExecutionContext taskExecutionContext, Logger logger) {
        super(taskExecutionContext, logger);
    }

    @Override
    public void handle() throws Exception {
        setExitStatusCode(Constants.EXIT_CODE_SUCCESS);
    }

    @Override
    public AbstractParameters getParameters() {
        return null;
    }
}
