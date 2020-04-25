/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinculacion.educamoises.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import static vinculacion.educamoises.utils.FrameUtil.changeJPanel;
import static vinculacion.educamoises.utils.FrameUtil.containerViews;

/**
 *
 * @author fredd
 */
public class LoginViewController  extends ViewController implements ActionListener,MouseListener{
 private final LoginView view = new LoginView();
 
    public LoginViewController() {
        
        initEvent();
        
    }

    @Override
    public JPanel getView() {
       return view;
    }

    @Override
    
    public void initEvent() {
        view.jButton1.addMouseListener(this);
        view.volver.addMouseListener(this);
        view.volver.addActionListener(this);
    }

     @Override
    public void removeView() {
        containerViews.removeAll();
    }
    
      @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getSource().equals(view.volver)) {
            removeView();
            changeJPanel(new MainViewController());
        }
        
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
       
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       if (me.getSource().equals(view.jButton1)) {
            view.jButton1.setForeground(new Color(255, 255, 255));
            view.jButton1.setBackground(new Color(237,173,57));
        }
       
         if (me.getSource().equals(view.volver)) {
            
            view.volver.setForeground(new Color(255, 255, 255));
        }

    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource().equals(view.jButton1)) {
            view.jButton1.setForeground(new Color(0, 0, 0));
            view.jButton1.setBackground(new Color(245,201,130));
        }
        
          if (me.getSource().equals(view.volver)) {
           
            view.volver.setForeground(new Color(0, 0, 0));
        }
    }

  
}
