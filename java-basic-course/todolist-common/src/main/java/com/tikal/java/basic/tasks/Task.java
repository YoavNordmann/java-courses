package com.tikal.java.basic.tasks;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

// TODO: Auto-generated Javadoc
/**
 * The Class Task.
 *
 * @author Yoav Nordmann
 * @since Mar 6, 2017
 */
public class Task {
	
	/** The id. */
	private String id;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	/** The done. */
	private boolean done;
	
	/** The created. */
	private Date created;
	
	/** The completed. */
	private Date completed;
	
	
	/**
	 * Instantiates a new task.
	 *
	 * @param name the name
	 * @param description the description
	 */
	public Task(String name, String description){
		this.name = name;
		this.description = description;
		this.id = UUID.randomUUID().toString();
		created = Date.from(Instant.now());
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	void setId(String id) {
		this.id = id;
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
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Checks if is done.
	 *
	 * @return true, if is done
	 */
	public boolean isDone() {
		return done;
	}
	
	/**
	 * Sets the done.
	 *
	 * @param done the new done
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 */
	public void setDone(boolean done) throws Exception {
		this.done = done;
		this.completed = Date.from(Instant.now());
	}
	
	/**
	 * Gets the created.
	 *
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}
	
	/**
	 * Sets the created.
	 *
	 * @param created the new created
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	
	/**
	 * Gets the completed.
	 *
	 * @return the completed
	 */
	public Date getCompleted() {
		return completed;
	}
	
	/**
	 * Sets the completed.
	 *
	 * @param completed the new completed
	 */
	public void setCompleted(Date completed) {
		this.completed = completed;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Task){
			Task other = (Task)obj;
			if(this.getId().equals(other.getId())){
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
		return this.getId().hashCode();
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name).append("\t\t").append(getDescription());
		builder.append("\t(").append(this.getCreated()).append(")\t\t");
		builder.append(this.isDone() ? "Done" : "Todo");
		return builder.toString();
	}
	

}
