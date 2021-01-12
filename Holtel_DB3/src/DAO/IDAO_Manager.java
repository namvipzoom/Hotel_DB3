/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author dell
 * @param <table>
 * @param <typeOfId>
 * @param <typeOfName>
 * @param <typeOfStatus>
 */
public interface IDAO_Manager<table, typeOfId, typeOfName, typeOfStatus> {

    List<table> getAllData();

    table findDataById(typeOfId id);

    List<table> findDataByName(typeOfName name);

    List<table> findDataByStatus(typeOfStatus status);

    public void insertData(table t);

    public void updateData(table t);

    public void deleteData(typeOfId id);

}
