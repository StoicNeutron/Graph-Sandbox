package Structure;

import java.util.LinkedList;
import javax.swing.JButton;

/**
 * This class represent each node of a graph structure.
 * @author stoicneutron
 */
public class Node {
    
    private final JButton node;
    public LinkedList<Node> adjacencies = new LinkedList<>();
    public String ID;
    public boolean visited = false;
    public int globalIndex;
    public int maxEdges;
    public int xCoordinate;
    public int yCoordinate;
    
    public Node(JButton button){
        node = button;
        ID = node.getText();
        xCoordinate = node.getX() + (node.getWidth()/2);
        yCoordinate = node.getY() + (node.getHeight()/2);
    }
    
    // getters methods
    public String getNodeID(){
        
        return node.getText();
    }
    
    public JButton getJButton(){
        
        return this.node;
    }
    
    public int getNumOfAdjacency(){
        
        return adjacencies.size();
    }
    
}
