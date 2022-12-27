package br.com.briangui.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TelaPrincipalController implements Initializable {

    @FXML
    private MenuBar barraMenu;

    @FXML
    private Menu menuArquivo;

    @FXML
    private MenuItem menuItemContado;

    @FXML
    private MenuItem menuItemCidade;

    @FXML
    private MenuItem menuItemRelatorioContatoEndereco;

    @FXML
    private MenuItem menuItemRelatorioContatoGeral;

    @FXML
    private MenuItem menuItemRelatorioContatoTelefone;

    @FXML
    private MenuItem menuItemRelatorioContatoTipo;

    @FXML
    private MenuItem menuItemSair;

    @FXML
    private MenuItem menuItemTipoContato;

    @FXML
    private MenuItem menuItemUsuario;

    @FXML
    private Menu menuRelatorio;

    @FXML
    private MenuItem menuItemSistema;

    @FXML
    private Menu menuSobre;

    @FXML
    void acessarCidadade(ActionEvent event) {
        abrirFormulario("cidade");

    }

    @FXML
    void acessarContato(ActionEvent event) {
        abrirFormulario("contato");
    }

    @FXML
    void acessarRelatorioContatoEndereco(ActionEvent event) {

    }

    @FXML
    void acessarRelatorioContatoGeral(ActionEvent event) {

    }

    @FXML
    void acessarRelatorioContatoTelefone(ActionEvent event) {

    }

    @FXML
    void acessarRelatorioContatoTipo(ActionEvent event) {

    }

    @FXML
    void acessarSair(ActionEvent event) {

    }

    @FXML
    void acessarSistema(ActionEvent event) {

    }

    @FXML
    void acessarTipoContato(ActionEvent event) {
        abrirFormulario("tipo-contato");

    }

    @FXML
    void acessarUsuario(ActionEvent event) {
        abrirFormulario("usuario");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {        
        menuItemContado.setGraphic(new ImageView(getResourceIcons("iconeMenuContato")));
        menuItemTipoContato.setGraphic(new ImageView(getResourceIcons("iconeMenuContatoTipo")));
        menuItemCidade.setGraphic(new ImageView(getResourceIcons("iconeMenuCidade")));
        menuItemUsuario.setGraphic(new ImageView(getResourceIcons("iconeMenuUsuario")));
        menuItemSair.setGraphic(new ImageView(getResourceIcons("iconeMenuSair")));

        menuItemRelatorioContatoGeral.setGraphic(new ImageView(getResourceIcons("iconeMenuRelatorio")));
        menuItemRelatorioContatoEndereco.setGraphic(new ImageView(getResourceIcons("iconeMenuRelatorio")));
        menuItemRelatorioContatoTelefone.setGraphic(new ImageView(getResourceIcons("iconeMenuRelatorio")));
        menuItemRelatorioContatoTipo.setGraphic(new ImageView(getResourceIcons("iconeMenuRelatorio")));

        menuItemSistema.setGraphic(new ImageView(getResourceIcons("iconeMenuSobre")));
        
    }

    private String getResourceIcons(String icone){
        return getClass().getResource("/icons/" + icone + ".png").toString();
    }

    public void abrirFormulario(String formulario){
        try {
            Parent form = FXMLLoader.load(getClass().getResource("/fxml/" + formulario + ".fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(form));
            stage.setTitle("Formulário");
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
