/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package components;


import baldrbeerpong.Tournament;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.MutableComboBoxModel;

/**
 *
 * @author vincent
 */
public class TournamentBox extends AbstractListModel implements MutableComboBoxModel{
    private ArrayList<Tournament> tournaments;
    private Object selectedItem;
    
    public TournamentBox(ArrayList<Tournament> tournaments) {
        this.tournaments = tournaments;
    }
    
    @Override
    public int getSize() {
        return tournaments.size();
    }

    @Override
    public Object getElementAt(int i) {
        return tournaments.get(i);
    }

    @Override
    public void setSelectedItem(Object o) {
        selectedItem = o;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    @Override
    public void addElement(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeElement(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void insertElementAt(Object o, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeElementAt(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
