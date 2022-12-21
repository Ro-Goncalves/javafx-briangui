package br.com.briangui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

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

    }

    @FXML
    void acessarContato(ActionEvent event) {

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

    }

    @FXML
    void acessarUsuario(ActionEvent event) {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {        
        menuItemContado.setGraphic(new ImageView(getResourceIcons("iconeMenuContato.png")));
        menuItemTipoContato.setGraphic(new ImageView(getResourceIcons("iconeMenuContatoTipo.png")));
        menuItemCidade.setGraphic(new ImageView(getResourceIcons("iconeMenuCidade.png")));
        menuItemUsuario.setGraphic(new ImageView(getResourceIcons("iconeMenuUsuario.png")));
        menuItemSair.setGraphic(new ImageView(getResourceIcons("iconeMenuSair.png")));

        menuItemRelatorioContatoGeral.setGraphic(new ImageView(getResourceIcons("iconeMenuRelatorio.png")));
        menuItemRelatorioContatoEndereco.setGraphic(new ImageView(getResourceIcons("iconeMenuRelatorio.png")));
        menuItemRelatorioContatoTelefone.setGraphic(new ImageView(getResourceIcons("iconeMenuRelatorio.png")));
        menuItemRelatorioContatoTipo.setGraphic(new ImageView(getResourceIcons("iconeMenuRelatorio.png")));

        menuItemSistema.setGraphic(new ImageView(getResourceIcons("iconeMenuSobre.png")));
        
    }

    private String getResourceIcons(String icone){
        return TelaPrincipalController.class.getResource("").toString() + "../icons/" + icone;
    }

}
