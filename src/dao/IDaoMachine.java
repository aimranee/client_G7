/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Machine;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IDaoMachine extends Remote {

    boolean create(Machine o) throws RemoteException;

    boolean update(Machine o) throws RemoteException;

    boolean delete(Machine o) throws RemoteException;

    Machine findById(int id) throws RemoteException;

    List<Machine> findAll() throws RemoteException;
    
    List<Machine> findAllMachinesBySalle(String code) throws RemoteException;
    
}
