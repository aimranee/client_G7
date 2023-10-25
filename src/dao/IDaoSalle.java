/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Salle;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IDaoSalle extends Remote {

    boolean create(Salle o) throws RemoteException;

    boolean update(Salle o) throws RemoteException;

    boolean delete(Salle o) throws RemoteException;

    Salle findById(int id) throws RemoteException;

    List<Salle> findAll() throws RemoteException;
    
    Salle findSalleByCode(String code) throws RemoteException;
}
