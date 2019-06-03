/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.export.ExportOptions;

import com.hrdb.models.query.*;

@Deprecated
public interface HrdbQueryExecutorService_V1 {

    @Deprecated
    public Page<Object> executeChecking(Pageable pageable);

    @Deprecated
    public Page<Object> executeEmploteeList(Pageable pageable);

    @Deprecated
    public Page<Object> executeEmployeeSelectVar(Pageable pageable, Integer selectedEmployee);

    @Deprecated
    public Page<Object> executeSearchEmployees(Pageable pageable);

    @Deprecated
    public Page<Object> executeSelectEmployee(Pageable pageable, Integer searchId, Integer liveListId);

    @Deprecated
    public Page<Object> executeEmployeeListOf_DeptId2(Pageable pageable);

    @Deprecated
    public Page<Object> executeEmployeeListOf_Deptid3(Pageable pageable);

    @Deprecated
    public Page<Object> executeEmployeeListOf_DeptId1(Pageable pageable);

    @Deprecated
    public Page<Object> executeDepartmentCount(Pageable pageable);

    @Deprecated
    public Page<Object> executeSrv_Var_EmployeeCount(Pageable pageable);

    @Deprecated
    public Page<Object> execute_ColleagueDetails(Pageable pageable, Integer selectedemployeedeptid, Integer selectedemployeeid);

    @Deprecated
    public Page<Object> executeSelectEmployeeVar(Pageable pageable, Integer searchId, Integer liveListId);

    @Deprecated
    public Page<Object> executeEmployeeListOf_DeptId4(Pageable pageable);

    @Deprecated
    public Page<Object> executeNoOfDepartment(Pageable pageable);

    @Deprecated
    public Page<Object> executeTotalBudget(Pageable pageable);

    @Deprecated
    public Page<Object> executeEmployeeListOf_DeptId5(Pageable pageable);

}