package com.future.rocket.gof23.chain;

import com.future.rocket.gof23.chain.behavior.AbstractLogger;
import com.future.rocket.gof23.chain.impl.ConsoleLogger;
import com.future.rocket.gof23.chain.impl.ErrorLogger;
import com.future.rocket.gof23.chain.impl.FileLogger;
import com.future.rocket.gof23.common.OtherTool;

public class ChainMain {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);

        fileLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(errorLogger);
        return fileLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "INFO MESSAGE");
        OtherTool.printSplitLine();
        loggerChain.logMessage(AbstractLogger.DEBUG, "DEBUG MESSAGE");
        OtherTool.printSplitLine();
        loggerChain.logMessage(AbstractLogger.ERROR, "ERROR MESSAGE");
        OtherTool.printSplitLine();
    }
}
