/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta_160425;

/**
 *
 * @author user
 */
public interface Relation {
    public boolean isGreaterWide (Object a, Object b);
    public boolean isLessWide( Object a, Object b);
    public boolean isEqualWide( Object a, Object b);
    
    public boolean isGreaterArround (Object x, Object y);
    public boolean isLessArround( Object x, Object y);
    public boolean isEqualArround( Object x, Object y);
    
}
