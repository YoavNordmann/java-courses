package com.tikal.java.basic.server.controllers;

import com.tikal.java.basic.tasks.Task;

public class TodolistRestController {
	
	
	
	public Task create(String taskListName, Task task){
		return TaskListContainer.getInstance().addTask(taskListName, task);
	}

	public Task read(String taskListname, String taskid){
		return TaskListContainer.getInstance().getTask(taskListname, taskid);
	}
	
	public Task update(String taskListname, Task task){
		return TaskListContainer.getInstance().updateTask(taskListname, task);
	}
	
	public Task delete(String taskListname, String taskid){
		return TaskListContainer.getInstance().deleteTask(taskListname, taskid);
	}

	
	
	
}
