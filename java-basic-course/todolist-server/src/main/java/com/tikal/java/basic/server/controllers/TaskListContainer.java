package com.tikal.java.basic.server.controllers;

import java.util.HashMap;
import java.util.Map;

import com.tikal.java.basic.tasks.Task;
import com.tikal.java.basic.tasks.TaskList;

public class TaskListContainer {
	
	private static TaskListContainer instance = new TaskListContainer();
	
	private static Map<String, TaskList> taskListMap;
	
	private TaskListContainer() {
		taskListMap = new HashMap<>();
	}
	
	public static TaskListContainer getInstance() {
		return instance;
	}
	
	
	public Task addTask(String taskListname, Task task){
		TaskList taskList = taskListMap.get(taskListname);
		if(taskList == null){
			taskList = new TaskList(taskListname);
			taskListMap.put(taskListname, taskList);
		}
		taskList.addTask(task);
		return task;
	}
	
	
	public Task getTask(String taskListname, String taskId){
		TaskList taskList = taskListMap.get(taskListname);
		if(taskList == null){
			return null;
		}
		
		return taskList.getAllTasks().stream()
		.filter(t -> {
			return t.getId().equals(taskId);
		})
		.findFirst().get();
	}

	public Task updateTask(String taskListname, Task task) {
		return null;
	}

	public Task deleteTask(String taskListname, String taskid) {
		return null;
	}
	
	

}
