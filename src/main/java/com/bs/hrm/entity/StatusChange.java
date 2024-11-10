package com.bs.hrm.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

import com.bs.hrm.entity.ids.StatusChangeId;

@Entity
@IdClass(StatusChangeId.class)
public class StatusChange {
	@Id
	private Long 			employeeId;
	@Id
	private Long 			statusChangeId;
	@Column(length=100)
	private String 			status;
	private Long 			requestedEmpId;
	private LocalDate		executionDate;
	private LocalDate		endDate;
	@Transient
	private String			executionDateStr;
	@Transient
	private String			endDateStr;
	@Column(length=150)
	private String 			remarks;
	@Column(length=80)
 	private String	    	filler1;
	@Column(length=80)
 	private String	    	filler2;
	@Column(length=80)
 	private String	    	filler3;
	@Column(length=80)
 	private String	    	filler4;
	@Column(length=80)
 	private String	    	filler5;
 	private LocalDateTime   createdDate;
	@Column(length=30)
 	private String	    	createdBy;
	@Column(length=50)
 	private String	    	createdIp;
 	private LocalDateTime 	updatedDate;
	@Column(length=30)
 	private String	    	updatedBy;
	@Column(length=40)
 	private String	    	updatedIp;
	
	public StatusChange() {
		
	}
	
	public StatusChange(Long employeeId, Long statusChangeId, String status, Long requestedEmpId,
			LocalDate executionDate, LocalDate endDate, String executionDateStr, String endDateStr, String remarks,
			String filler1, String filler2, String filler3, String filler4, String filler5, LocalDateTime createdDate,
			String createdBy, String createdIp, LocalDateTime updatedDate, String updatedBy, String updatedIp) {
		super();
		this.employeeId = employeeId;
		this.statusChangeId = statusChangeId;
		this.status = status;
		this.requestedEmpId = requestedEmpId;
		this.executionDate = executionDate;
		this.endDate = endDate;
		this.executionDateStr = executionDateStr;
		this.endDateStr = endDateStr;
		this.remarks = remarks;
		this.filler1 = filler1;
		this.filler2 = filler2;
		this.filler3 = filler3;
		this.filler4 = filler4;
		this.filler5 = filler5;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.createdIp = createdIp;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.updatedIp = updatedIp;
	}

	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getStatusChangeId() {
		return statusChangeId;
	}
	public void setStatusChangeId(Long statusChangeId) {
		this.statusChangeId = statusChangeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getRequestedEmpId() {
		return requestedEmpId;
	}
	public void setRequestedEmpId(Long requestedEmpId) {
		this.requestedEmpId = requestedEmpId;
	}
	public LocalDate getExecutionDate() {
		return executionDate;
	}
	public void setExecutionDate(LocalDate executionDate) {
		this.executionDate = executionDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getFiller1() {
		return filler1;
	}
	public void setFiller1(String filler1) {
		this.filler1 = filler1;
	}
	public String getFiller2() {
		return filler2;
	}
	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}
	public String getFiller3() {
		return filler3;
	}
	public void setFiller3(String filler3) {
		this.filler3 = filler3;
	}
	public String getFiller4() {
		return filler4;
	}
	public void setFiller4(String filler4) {
		this.filler4 = filler4;
	}
	public String getFiller5() {
		return filler5;
	}
	public void setFiller5(String filler5) {
		this.filler5 = filler5;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedIp() {
		return createdIp;
	}
	public void setCreatedIp(String createdIp) {
		this.createdIp = createdIp;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedIp() {
		return updatedIp;
	}
	public void setUpdatedIp(String updatedIp) {
		this.updatedIp = updatedIp;
	}
	public String getExecutionDateStr() {
		return executionDateStr;
	}
	public void setExecutionDateStr(String executionDateStr) {
		this.executionDateStr = executionDateStr;
	}
	public String getEndDateStr() {
		return endDateStr;
	}
	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}

	@Override
	public String toString() {
		return "StatusChange [employeeId=" + employeeId + ", statusChangeId=" + statusChangeId + ", status=" + status
				+ ", requestedEmpId=" + requestedEmpId + ", executionDate=" + executionDate + ", endDate=" + endDate
				+ ", executionDateStr=" + executionDateStr + ", endDateStr=" + endDateStr + ", remarks=" + remarks
				+ ", filler1=" + filler1 + ", filler2=" + filler2 + ", filler3=" + filler3 + ", filler4=" + filler4
				+ ", filler5=" + filler5 + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", createdIp="
				+ createdIp + ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp
				+ "]";
	}

}