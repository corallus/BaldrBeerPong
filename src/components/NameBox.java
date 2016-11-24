/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import baldrbeerpong.Player;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractListModel;
import javax.swing.MutableComboBoxModel;

/**
 *
 * @author vincent
 */
public class NameBox extends AbstractListModel implements MutableComboBoxModel{
    private ArrayList<Player> players;
    private Object selectedItem;
    
    public NameBox(ArrayList<Player> players) {
        Collections.sort(players, new NameComparator());
        this.players = players;
    }
    
    @Override
    public int getSize() {
        return players.size();
    }

    @Override
    public Object getElementAt(int i) {
        return players.get(i);
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
