package com.tikal.java.basic.tasks;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * The Class TaskList.
 *
 * @author Yoav Nordmann
 * @since Mar 6, 2017
 */
public class TaskList {
	
	
	/** The name. */
	private String name;
	
	/** The task list. */
	private List<Task> taskList;
	
	/**
	 * Instantiates a new task list.
	 *
	 * @param name the name
	 */
	public TaskList(String name) {
		this.name = name;
		this.taskList = new LinkedList<>();
	}
	
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * Adds the task.
	 *
	 * @param task the task
	 * @return true, if successful
	 */
	public boolean addTask(Task task){
		return taskList.add(task);
	}
	
	
	/**
	 * Removes the task.
	 *
	 * @param task the task
	 * @return true, if successful
	 */
	public boolean removeTask(Task task){
		return taskList.remove(task);
	}
	
	
	
	/**
	 * Gets the all tasks.
	 *
	 * @return the all tasks
	 */
	public List<Task> getAllTasks() {
		return Collections.unmodifiableList(this.taskList);
	}
	
	
	public Iterator<Task> getAllTasksItr() {
		return this.taskList.iterator();
	}

	
	/**
	 * Removes the task.
	 *
	 * @param id the id
	 * @return true, if successful
	 */
	public boolean removeTask(String id){
		Iterator<Task> iterator = taskList.iterator();
		while(iterator.hasNext()){
			Task task = iterator.next();
			if(task.getId().equals(id)){
				iterator.remove();
				return true;
			}
		}
		return false;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TaskList){
			TaskList other = (TaskList)obj;
			return this.getName().equals(other.getName());
		}
		return false;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getName() + "("+ this.taskList.size() + ")";
	}
	
	
}
