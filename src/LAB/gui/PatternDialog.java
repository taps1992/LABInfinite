package LAB.gui;

import javax.swing.*;

import LAB.LABInfinite;
import LAB.meta.Pattern;
import LAB.meta.Patterns;

import java.beans.*; //property change stuff
import java.util.List;
import java.awt.*;
import java.awt.event.*;

/* 1.4 example used by DialogDemo.java. */
public class PatternDialog extends JDialog {

	private static final long serialVersionUID = -3716670118565802944L;
	private String typedText = null;
    private JLabel label = new JLabel("N/A");
    JTextField renameField;

    private Pattern selection = null; 

    /**
     * Returns null if the typed string was invalid;
     * otherwise, returns the string as the user entered it.
     */
    public String getValidatedText() {
        return typedText;
    }

    /** Creates the reusable dialog. */
    public PatternDialog(LABInfinite aFrame, String aWord, Dialog parent) {
        super(aFrame, true);
        setTitle("Organise Patterns");
        this.setPreferredSize(new Dimension(400,400));
        super.setPreferredSize(new Dimension(400,400));
        this.setMinimumSize(new Dimension(400,400));
        
        final List<Pattern> patterns = Patterns.userPatterns;
        JComboBox<Object[]> patternList = new JComboBox(patterns.toArray()); 
        //patternList.setEditable(true);
        patternList.addActionListener( new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox)e.getSource();
                //String newSelection = cb.getEditor().getItem().toString();
                Pattern pattern = (Pattern)cb.getSelectedItem();
                selection = pattern; 
                //pattern.setName(newSelection);
                label.setText(selection.getName());
                renameField.setText(selection.getName());
        } } ) ;

        JPanel all = new JPanel();
        all.setLayout(new GridLayout(4, 1));
        
        
        
        JPanel p = new JPanel();
        
        p.add(patternList); 
        
        JButton rename = new JButton("Rename"); 
        JButton delete = new JButton("Delete"); 
        JButton createFolder = new JButton("Create Folder"); 
        JButton moveToFolder = new JButton("Move to Folder");
        JButton saveAllChanges = new JButton("Save All Changes");
        JButton cancel = new JButton("Cancel");
        JButton done = new JButton("Done"); 
        
        JLabel renameLabel = new JLabel("Rename To:");
        renameField = new JTextField("Rename This Pattern");
     
        
        JPanel renamePanel = new JPanel();
        renamePanel.add(renameLabel); 
        renamePanel.add(renameField); 
        renamePanel.add(rename); 
        
        delete.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			patterns.remove(selection);
		} } );
        
        done.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
        	setVisible(false);
		} } );
        
        cancel.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
        	setVisible(false);
        	// TODO more here should close and reset state to normal
		} } );
        
        rename.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			selection.setName(renameField.getText());
		} } );
        
        saveAllChanges.addActionListener ( new ActionListener() { public void actionPerformed ( ActionEvent event ) {
			Patterns.saveAllPatterns(patterns, "patterns");
		} } );
        
        
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(delete);
        buttonPanel.add(saveAllChanges);
        buttonPanel.add(cancel);
        buttonPanel.add(done); 
        
        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.add(createFolder); 
        buttonPanel2.add(moveToFolder); 
        
        all.add(p); 
        all.add(label); 
        all.add(renamePanel); 
        all.add(buttonPanel); 
        all.add(buttonPanel2); 
        
        
        this.add(all);
        
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    /** This method reacts to state changes in the option pane. */
    public void propertyChange(PropertyChangeEvent e) {
        
    }

    /** This method clears the dialog and hides it. */
    public void clearAndHide() {
        setVisible(false);
    }
}
