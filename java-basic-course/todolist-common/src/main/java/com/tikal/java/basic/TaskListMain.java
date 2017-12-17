package com.tikal.java.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tikal.java.basic.tasks.Task;
import com.tikal.java.basic.tasks.TaskList;

/**
 * The Class TaskListMain.
 *
 * @author Yoav Nordmann
 * @since Mar 6, 2017
 */
public class TaskListMain {
	
	private final static Logger logger = LoggerFactory.getLogger(TaskListMain.class);
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		logger.info("Starting Main Function");
		
		TaskList taskList = new TaskList("main");
		
		taskList.addTask(new Task("Yoav Nordmann", "Go to Sleep"));
		taskList.addTask(new Task("Nadav Nordmann", "Get Dressed"));
		
		logger.info("Finished Adding Tasks");
		
		taskList.getAllTasks().stream().forEach(System.out::println);
		
		System.out.println("\n\n");
		
		taskList.getAllTasks().get(0).setDone(true);
		
		logger.info("Setting first task as done");
		
		taskList.getAllTasks().stream().forEach(System.out::println);
		
		logger.info("Done");
		
	}

}
