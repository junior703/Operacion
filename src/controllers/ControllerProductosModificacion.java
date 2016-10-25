/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.ViewProductosModificacion;
import models.ModelProductosModificacion;

/**
 * 
 * @author Bnc
 */
public class ControllerProductosModificacion  implements ActionListener{
   private final ViewProductosModificacion viewProductosModificacion;
    private final ModelProductosModificacion modelProductosModificacion;
  
   
    public ControllerProductosModificacion(ViewProductosModificacion viewProductosModificacion, ModelProductosModificacion modelProductosModificacion) {
        this.viewProductosModificacion = viewProductosModificacion;
        this.modelProductosModificacion = modelProductosModificacion;
    
        
            this.viewProductosModificacion.jbprimero.addActionListener(this);  
          this.viewProductosModificacion.jbanterior.addActionListener(this);
          this.viewProductosModificacion.jbsiguiente.addActionListener(this); 
              this.viewProductosModificacion.jbultimo.addActionListener(this); 
               this.viewProductosModificacion.jbagregar.addActionListener(this);  
          this.viewProductosModificacion.jbborrar.addActionListener(this);
          this.viewProductosModificacion.jbeditar.addActionListener(this); 
              this.viewProductosModificacion.jbguadar.addActionListener(this); 
              initView();
              showRecords();
    }

     public void actionPerformed(ActionEvent g) {
        if (g.getSource() == viewProductosModificacion.jbprimero){
            firstButton();
        }
        else if (g.getSource() == viewProductosModificacion.jbanterior){
            previousButton();
        }
        else if (g.getSource() == viewProductosModificacion.jbsiguiente){
            nextButton();
        }
        else if (g.getSource() == viewProductosModificacion.jbultimo){
            lastButton();
        }
        else if (g.getSource() == viewProductosModificacion.jbagregar){
            aggregar();
        }else if (g.getSource() == viewProductosModificacion.jbguadar){
            guardar();
        }else if (g.getSource() == viewProductosModificacion.jbborrar){
            deleteRecordButton();
        }  else if (g.getSource() == viewProductosModificacion.jbeditar){
          guardarcambios();//alterRecordButton();
        } 
    }
    
    private void firstButton() {
        modelProductosModificacion.moveFirst();
        modelProductosModificacion.setValues();
        showValues();
    }
    
    private void previousButton() {
        modelProductosModificacion.movePrevious();
        modelProductosModificacion.setValues();
        showValues();
    }
    
    private void nextButton() {
        modelProductosModificacion.moveNext();
        modelProductosModificacion.setValues();
        showValues();
    }
    
    private void lastButton() {
        modelProductosModificacion.moveLast();
        modelProductosModificacion.setValues();
        showValues();
    }
      
    private void aggregar() {       
          viewProductosModificacion.jTidproducto.setText("");
        viewProductosModificacion.jtproducto.setText("");
        viewProductosModificacion.jtdescricion.setText("");
        viewProductosModificacion.jtpreciocompra.setText("");
        viewProductosModificacion.jtprecioventa.setText("");
          viewProductosModificacion.jtexistencias.setText("");
    }
    
    public void guardar(){
     int dialog = JOptionPane.showConfirmDialog(null, "¿Quieres guardar el nuevo registro?");
        if (dialog == 0){
            String productos = viewProductosModificacion.jtproducto.getText();
            String Descripcion = viewProductosModificacion.jtdescricion.getText();
          Double preciocompra =Double.parseDouble(viewProductosModificacion.jtpreciocompra.getText()); 
           Double precioventa =Double.parseDouble(viewProductosModificacion.jtprecioventa.getText()); 
            int existencias =Integer.parseInt( viewProductosModificacion.jtexistencias.getText());
           if (viewProductosModificacion.jtproducto.getText().isEmpty() || viewProductosModificacion.jtdescricion.getText().isEmpty() || viewProductosModificacion.jtpreciocompra.getText().isEmpty()||viewProductosModificacion.jtprecioventa.getText().isEmpty()||viewProductosModificacion.jtprecioventa.getText().isEmpty()){
                  }
            else {
             modelProductosModificacion.guardarregistro(productos,Descripcion,preciocompra,precioventa, existencias) ;
  
               modelProductosModificacion.setValues();
                showValues();
                firstButton();
           
           }
        }
    }
    
       private void deleteRecordButton(){
        this.modelProductosModificacion.deleteRecord(Integer.parseInt(viewProductosModificacion.jTidproducto.getText()));
           modelProductosModificacion.setValues();
           showValues();
        
    }
        private void alterRecordButton() {
        int dialog = JOptionPane.showConfirmDialog(null, "¿Desea modificar este registro?");
    }
        
            private void guardarcambios() {
        int dialog = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios?");
                 int idproductos =Integer.parseInt( viewProductosModificacion.jTidproducto.getText());
         String productos = viewProductosModificacion.jtproducto.getText();
            String Descripcion = viewProductosModificacion.jtdescricion.getText();
          Double preciocompra =Double.parseDouble(viewProductosModificacion.jtpreciocompra.getText()); 
           Double precioventa =Double.parseDouble(viewProductosModificacion.jtprecioventa.getText()); 
            int existencias =Integer.parseInt( viewProductosModificacion.jtexistencias.getText());
         
                modelProductosModificacion.alterRecord(idproductos, productos, Descripcion,preciocompra,precioventa,existencias);
                JOptionPane.showMessageDialog(null, "Se han guardado los cambios con éxito");
                modelProductosModificacion.setValues();
                showValues();
                firstButton();
            
        
    }
    
    
    private void showValues() {
        
     //   this.modelProductosModificacion.setIdproductos(Interger.parseInteger(viewProductosModificacion.jTidproducto.getText() ));
        viewProductosModificacion.jTidproducto.setText("" + modelProductosModificacion.getIdproductos());
        viewProductosModificacion.jtdescricion.setText(modelProductosModificacion.getDescripcion());
        viewProductosModificacion.jtproducto.setText(modelProductosModificacion.getProductos());
        viewProductosModificacion.jtpreciocompra.setText(""+modelProductosModificacion.getPreciocompra());    
      //    this.modelarea.setLargo(Double.parseDouble(viewarea.jTlargo.getText()));
          viewProductosModificacion.jtprecioventa.setText(""+modelProductosModificacion.getPrecioventa());
        viewProductosModificacion.jtexistencias.setText(""+modelProductosModificacion.getExistencias());  
    }
    
    private void initView() {
        viewProductosModificacion.setVisible(true);
        modelProductosModificacion.initValues();
        modelProductosModificacion.setValues();
       
    }

     private void showRecords() {
        viewProductosModificacion.jtbledetalle.setModel(modelProductosModificacion.tableModel);
        modelProductosModificacion.populateTable();
    }
  
}
    

