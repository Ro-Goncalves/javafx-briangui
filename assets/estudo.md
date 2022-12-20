# JavaFX

Fonte: tutorialspoint/javafx/index.htm

## Aplicativo

### Principais classes da API

* **javafx.animation** - Contém classes para adicionar animações baseadas em transição, como preenchimento, esmaecimento, rotação, escala e translação.
* **javafx.application** - Contém um conjunto de classes responsáveis pelo ciclo de vida do aplicativo JavaFX
* **javafx.css** - Contém classes para adicionar estilos semelhantes a CSS a aplicativos JavaFX
* **javafx.event** - Contém classes e interfaces para entregar e manipular eventos JavaFX
* **javafx.geometry** - Contém classes para definir objetos 2d e executar operações neles.
* **javafx.stage** - Contém classes de contêiner de nível superior para o aplicativo JavaFX.
* **javafx.scene** - Contém classes e interfaces para suportar o grafo de cena. Além disso, também fornece subpacotes como canvas, chart, control, effect, image, input, layout, media, paint, shape, text, transform, web, ....

![arquitetura-javafx](arquitetura-javafx.drawio.png)

### Scene Graph

O **scene graph** é o ponto de partida de uma aplicação JavaFX, ele contém todos os nós, que nada mais sao do que objetos visuais que podem incluir:

* **Objetos geométricos (gráficos)** - 2 e 3D, como círculos, retângulos, etc.
* **Controles de UI** - Button, Checkbox, Choice box, etc.
* **Contêiners** - painéis de layout, como painel de borda, painel de grade, painel de fluxo, etc.
* **Elementos de mídia** - como objetos de áudio, video, e imagem.

Uma coleção de nós gera um **scene graph**.

![graph-nodes](graph-nodes.drawio.png)

Cada **node** possui somente um pai, e aquele que não pai, chamamos de **root node**. O **node** que não possui filho chamamos de **lead node**, já o que possui filho é o **branch node**. Cada **node** é único em um **scene graph** e suas propriedades podem ser manipuladas.

### Prism

É um **pipeline** gráfico acelerador por hardrware de alto desempenho que usar:

* DirectX 9 no Windows XP e Vista.
* DirectX 11 no Windows 7.
* OpenGL no Mac e Linux.

Quando o sistema possuí gráficos integrados, os gráficos são mais suaves, quando não existir ele usará renderização por software.

### GWT (Glass Windowing Toolkit)

Fornece serviço para gerenciamento de janelas, temporizadore, superfícies e filas de evento. É ele que conecta a plataforma ao simtema operacional.

### Quantum Toolkit

É a abstração de baixo nível dos componentes gráficos que os deixa disponíveis ao JavaFX.

### WebView

Com a tecnólogia **Web Kit** possibilita a incorporação ed conteúto HTML ao **scene graph**. Suporta tecnologias como: HTML5, CSS, JavaScript, DOM e SVG. As possibilidades são muitas, dentre elas destacamos:

* Renderizar conteúdo HTML de URL local ou remota.
* Histórico de suporte e fornecer navegação para frente e para trás.
* Recarregar o conteúdo.
* Aplicar efeito aos componentes da web.
* Editar conteúdo HTML.
* Executar comando JavaScript.
* Lidar com eventos.

### Media Engine

O **media engine** é baseado no mecanismo de reprodução de conteúdo de áucio e vídeo **Streamer** que da suporte à: **MP3, WAV, AIFF e FLV**. Quem cuida disso éa biblioteca `javafx.scene.media`. Ela fornece os componentes:

* **Media Object** - Representa um arquivo de midia.
* **Media Player** - Reproduz o conteúdo de midia.
* **Media View** - Exibe a midia.

### Estrutura Do Aplicativo JavaFX

Em geral, o aplicativo JavaFX possui os componente: **Stage, Scene e Scene Graph**.

![application-struture](application-struture.drawio.png)

#### Stage

É nela que encontramos todos os objetos do aplicativo, seria uma janela. É representada pela classe **Stage** do pacote `javafx.stage`. O primeiro **stage** é criado pela plataforma. O método `start()` da classe **Application** recebe um objeto **stage**. O **stage** possui dois parâmetros para posição **Width e Height**, dividi-se em *Área De Conteúdo e Decorações (Barra De Título e Bordas)*.

Os **stages** são:

* Decorated
* Undecorated
* Transparent
* Unified
* Utitlity

Seu conteúdo pode ser exibido chamando `show()`.

#### Scene

Representa o conteúdo do aplicativo. A clase **Scene** faz parte do pacote `javafx.scene`, é ele que é adicionado a um estágio. Também podemo definir o seu tamanho, bem como o **root node** na hora de intânciar a classe.

#### Scene Graph e Nodes

O **scene graph** é uma estrutura no formato de árvore que representa o conteúdo de uma **scene**, os **nodes** são os objetos visial de um **scene graph**. Já comentamos os tipos de [**nodes**](#scene-graph), e um pouco sobre os tipos, que irei reforçar e complementar aqui.

* **root node** - Primeiro **node** do **scene graph**
* **branch node/Parente node** - **node** que não possui pai. A classe **Parent** do pacote `javafx.scene` e a geradora dos pais, que podem ser do seguinte tipo:
  * **Group** - Lista de nós filhos, sempre que é renderizado, os filhos tamém o são, em ordem. Qualquer efeito aplicado ao grupo será aplicado a todos os filhos.
  * **Region** - Base dos controle de interface baseados em *JavaFX Node -> Chart, Pane e Control*
  * **WebView** - Gerencia o mecânismo que trabalho com conteúdo web
* **leaf node** - Aquele que não possui filho, exemplo: *Rectangle, Ellipse, Box, ImageVies, MediaView etc*

### Primeiro contado com JavaFX

Primeiro devemos sobrescrever o método abstrato `start()` da classe **Application** que é a porteira do brinquedo. Essa classe deve ser herdada em nossa classe principal.

No método `main()` iniciaremos o aplicativo chamando `launch()`, esse método é encarregado de chamar o `start()`.

```java
/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
       /*
        * Stage, Scene, Scene Graph
       */
    }   

    public static void main(String[] args) {
        launch();
    }

}
```

Dentro de `start()`, precisaremos seguir às seguinte etapas:

* Criar um **scene graph** com seus **nodes**.
* Criar uma **scene** com a dimensões desejadas e passar o **root node**.
* Criar um **stage**, adicionar a **scene** e mostrar o conteúdo do **stage**.

#### Preparando o Scene Graph

Primeiro deveremos criar um **root node**, para isso poderemos escolher um entre *Grupo, Region ou WebView*.

**Group** - É representado pela chamada **Group** do pacota `javafx.scene`.

```java
Grup root = new Group();
```

O método `getChildren()` retorna um **ObservableList** que contém os **nodes**. É nele que adicionaremos nossos **nodes**.

```java
Observable list = root.getChildre();

list.add(NodeObject);
```

Também é possível passar um **node** na criação do objeto **Group**.

**Region** - Classe base para controle de interface como:

* **Chart** - Classe base do gráfico, pertence ao pacote `javafx.scene.chart`. Possui as subclasses **PieChart** e **XYChart**, que por sua vez possuem sobclasses como **AreaChart, BarChart, BubleChart etc**
* **Pane** - Clase base dos painéis, como **AchorPane, BoderPane, DialogPane etc**. Elas são encontradas no pacote `javafx.scene.layout`.
* **Control** - Classe base dos controle de interface, como **Accordion, ButtonBar, ChoiceBox, ComboBoxBase, HTMLEditor etc**. Elas ão encontradas no pacot `javafx.scene.control`.

Cada uma dessas classes podem ser usadas como nós raiz.

```java
StackPane pane = new StackPane();

ObservableList list = pane.getChildren();
list.add(NodeObject)
```

**WebView** - Gerencia a exibição do conteúdo web.

Uma breve imagem sobre:

![diagrama-hierarquia](diagrama-hierarquia.drawio.png)

#### Preparando a Scene

O pacote `javafx.scene` possui a classe **Scene**, sua instância representa uma **scene**. Quando criamo o objeto é obrigatório passar o **root node**.

```java
Scene scene = new Scene(root);
```

Também podemos definir o tamanho da **scene**, para isso:

```java
Scene scene = new Scene(roo, 600, 300);
```

#### Preparando o **Stage**

Todo aplicativo deve conter esse contêiner, pois é ele que fornece uma janela a ele. É uma instância da classe **Stage** do pacote `javafx.stage`. Um objeto dessa classe é passado como parâmetro para o método `start()` da classe **Application**.

Podemos executar algumas ações com o objeto **stage**:

* Definir o título com `setTitle()`.
* Adicionar a **scene** no **stage** com `setScene()`.
* Exibir o seu conteúdo com `show()`.

```java
primaryStage.setTitle("Olá Mundo");

primaryStage.setScene(scene);

primaryStage.show();
```

### Ciclo de vida do aplicativo

Os método do siclo de vida são:

* `start()` - Método do ponto de entrada onde o código gráfico deve ser escrito
* `stop()` - Lógica para parar o aplicativo.
* `init()` - Pode ser criado um **stage** ou **scene** nele.

Além desses temos o método estático `launch()` que inicia o aplicativo. Quando o chamamos acontece o que se segue:

* É criado uma intÂncia da clesse do aplicativo.
* O método `init()` é chamado.
* O método `start()` é chamado.
* Espera o aplicativo fechar e chama o método `stop()`.

### Encerrando o aplicativo

O aplicativo é encerrado implicitamente quando a última janela for fechada, esse comportamento pode ser alterado passando `false` ao método estático `setImplicitExit()`.

Para encerrar implicitamento basta usar: `Plataform.exit()` ou `System.exit(init)`.

### Exemplo 1 - Criando Uma Janela Vazia

Mãos na massa.

#### E1 - Passo 1

Criar uma classe que herde de **Application** e implemente o método `start()`

```java
public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
    }   
}
```

#### E1 - Passo 2

Criando um objeto **Group** dentro do método `start()`.

```java
public class TesteAplicativoJanelaVazia extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
    }
}
```

#### E1 - Passo 3

Criando um objeto **Scene** que receberá nosso *root* e as dimensões da tela.

```java
public class TesteAplicativoJanelaVazia extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 300);
    }
}
```

#### E1 - Passo 4

Definindo um título usando `setTitle()` da clase **Stage**. A instância dessa classe é representada pelo objeto `primaryStage`.

```java
public class TesteAplicativoJanelaVazia extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 300);

        primaryStage.setTitle("BrianGui");
    }
}
```

#### E1 - Passo 5

Adicionando o objeto **Scene** ao **Stage** com `setScene()`.

```java
public class TesteAplicativoJanelaVazia extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 300);

        primaryStage.setTitle("BrianGui");
        primaryStage.setScene(scene);
    }
}
```

#### E1 - Passo 6

Usar o método `show()` do objeto **Stage** para mostrar o conteúdo.

```java
public class TesteAplicativoJanelaVazia extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 300);

        primaryStage.setTitle("BrianGui");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
```

#### E1 - Passo 7

Iniciando o aplicativo com `launch()`, faremos isso dentro do método estático `main`.

```java
public class TesteAplicativoJanelaVazia extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 300);

        primaryStage.setTitle("BrianGui");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Exemplo 2 - Desenhar uma linha reta

Aproveitando o que já foi criado, iremos incluir uma linha reta.

#### E2 - Criando uma linha

A linha é criada a partir da intância da classe **Line** do pacote `javafx.scene.shape`.

```java
//Criando a linha
Line line = new Line();
```

#### E2 - Definindo a propriedades da linha

A coordenadas da linha são configuradas com os métodos `startX()`, `startY()`, `endX()` e `endY()`.

```java
//Coordenadas da linha
line.setStartX(100.0);
line.setStartY(150.00);
line.setEndX(500.0);
line.setEndY(150.0);
```

#### E2 - Inserimos nossa linha no grupo

Inserindo a linha no grupo.

```java
//Criando o grupo e passando a linha como parâmetro
Group root = new Group(line);
```

#### E2 - Resultado

![tela-com-linha](img/tela-com-linha.png)

### Exemplo 3 - Exibindo Texto

Vamos fazer o mesmo do que com o exemplo dois, porém com um objeto do tipo `Text`.

#### E3 - Incorporando Texto

Os objetos que representam um texto no aplicação são instâncias da classe **Text** do pacote `javafx.scene.text`. Ao criar o objeto podemos passar ou não o texto que ele deverá ter.

```java
//Criando o objeto texto
Text text = new Text();
```

#### E3 - Configurando a Fonte

O método `setFont()` recebe um objeto do tipo **Font** como parâmetro. Esse objeto pode controlar todo o estilo da fonte que iremos utilizar, por hora, vamos altera o tamanho.

```java
//Configurando o tamanho da fonte
text.setFont(new Font(45));
```

#### E3 - Definindo a posição do objeto

Usaremos o mesmo padrão de coordenadas da linha, o plano XY. Aqui definiremos o vértice inicial.

```java
//Coordenadas do vertice inical
text.setX(200);
text.setY(150);
```

#### E3 - Definindo o texto que será apresentado

Utilizando o método `setText()`, podemos indicar à aplicação qual o texto que deverá ser renderizado.

```java
//Definindo o texto
text.setText("Brian - Gui");
```

#### E3 - Adicionar o Text ao Group

Por fim, adicionamos ao grupo.

```java
//Criando o group e passando a linha como parâmetro
Group root = new Group(line, text);
```

#### E3 - Resultado

![tela-com-text](img/tela-com-texto.png)

## Formas 2D

Com o JavaFX podemos desenhar:

* Figuras predefinidas como: **Linha, Retangulo, Circulo, Elipse, Poligonos, Curva Cúbica, Curva Quadrática, Arco**.
* *Path elements* como: **MoveTo Path Element, Linha, Linha Horizontal, Linha Vertical, Curva Cúbica, Curva Quadrática, Arco**
* Também é possível utilizar arquivos SVG.

Cada forma 2D é representada por uma classe, e todas elas estão presentes no pacote `javafx.scene.shape`. A classe **Shape** é a que representa todas as formas bidimensionais.

### Criando um forma 2D

O passo-a-passo é mais ou menos o mesmo que vimos até aqui:

* Intânciar um objeto com a classe da forma que desejamos usar
* Definiar as propriedades da forma
* Adicionar a forma ao **Group**

Assim como foi feito nos exemplos anteriores.

### Formas providas pelo JavaFX

|Forma|Descrição|
|:---|:---|
|**Linha**| É representada pela classe **Line** do pacote `javafx.scene.shape`|
|**Retângulo**| É representada pela classe **Rectangle** do pacote `javafx.scene.shape`|
|**Retângulo Arredondado**| É um retângulo com arestas arqueadas|
|**Círculo**| É representada pela classe **Circle** do pacote `javafx.scene.shape`|
|**Elipse**| É representada pela classe **Ellipse** do pacote `javafx.scene.shape`|
|**Polígono**| É representada pela classe **Polygon** do pacote `javafx.scene.shape`|
|**Polilinha**| Como se fosse um polígono, só que não é fechado no final. É representada pela classe **Polygon** do pacote `javafx.scene.shape`|
|**Curva Cúbica**| Curva para uma equação de 3º grau. É representada pela classe **CubicCurve** do pacote `javafx.scene.shape`|
|**Curva Quadrática**| Curva para uma equação de 2º grau. É representada pela classe **QuadCurve** do pacote `javafx.scene.shape`|
|**Arco**| É representada pela classe **Arc** do pacote `javafx.scene.shape`, esses arcos podem ser **Aberto, Corda, Redondo**|
|**SVGPath**| É representada pela classe **SVGPath** do pacote `javafx.scene.shape`. Com ela podemos construir imagens analisando caminhos SVG; a classe **SVGPath** possui a propriedade `String content` que representa o caminho SVG|

### Desenhando mais formas através da classe Path

Existem momentos em que as formas predefinidas não dão conta do recado, por exemplo: desenhar uma estrela, para isso usaremos uma outra classe.

#### A classe Path

A classe **Path** é utilizada para desenhar o contorno de formas geómetricas complexas. A ele passamos uma lista de observaveis conténdo **Path Elements** como *moveTo, LineTo, HlineTo, VlineTo, ArcTo, QuadCurveTo, CubicCurveTo*.

Podemos passar a lista de observaveis de duas formas, no construtor ou utilizando o método `addAll()`.

```java
Path myshape = new Path(pathElement1, pathElement2, pathElement3)

Path myshape = new Path();
myshape.getElements().addAll(pathElement1, pathElement2, pathElement3);
```

##### MoveTo

Move a posição atual do **Path** para um outro. Normalmente é usado para definir o ponto inícial duma forma. É representada pela classe **MoveTo** do pacote `javafx.scene.shape`. Possui duas propriedade:

* **X**: Coordenada x do ponto ao qual um linha deve ser desenhada a partir da posição atual.
* **Y**: Coordenada y do ponto ao qual um linha deve ser desenhada a partir da posição atual.

Esses valores podem ser passados no construtor da classe, caso não passe o valor será definido como (0,0) e poderá ser passado posteriormente com os métodos `setX()` e `setY()`.

```java
MoveTo moveTo = new MoveTo(x, y);

MoveTo moveTo = new MoveTo();
moveTo.setX(x);
moveTo.setY(y);
```

#### Exemplo - Desenhando um caminho complexo

O código para criar nossa imagem será:

```java
//Criando um Path
Path path = new Path();

//Movendo ao ponto inicial
MoveTo initialPath = new MoveTo(108, 71);
//Criando a 1ª linha
LineTo lineTo1 = new LineTo(321, 161);
//Criando a 2ª linha
LineTo lineTo2 = new LineTo(126, 232);
//Criando a 3ª linha
LineTo lineTo3 = new LineTo(232, 52);
//Criando a 4ª linha
LineTo lineTo4 = new LineTo(269, 250);
//Criando a 5ª linha
LineTo lineTo5 = new LineTo(108, 71);

//Adicionando todos os elementos ao Path
path.getElements().add(initialPath);
path.getElements().addAll(lineTo1, lineTo2, lineTo3, lineTo4, lineTo5);

Group root = new Group(path); 
```

**Resultado:**

![tela-com-figura-complexa](img/tela-com-figura-complexa.png)

#### Path elements fornecidos pelo JavaFX

|Forma|Descrição|
|:---|:---|
|**LineTo**| Desenha uma linha do ponto inicial até o final. Representado pela classe **LineTo** do pacote `javafx.scene.shape`|
|**HlineTo**| Desenha uma linha horizontal a partir do ponto atual até a posição especificada. Representado pela classe **HlineTo** do pacote `javafx.scene.shape`|
|**VlineTo**| Desenha uma linha vertical a partir do ponto atual até a posição especificada. Representado pela classe **VlineTo** do pacote `javafx.scene.shape`|
|**QuadCurveTo**| Desenha uma curva quadrática a partir do ponto atual até a posição especificada. Representado pela classe **QuadraticCurveTo** do pacote `javafx.scene.shape`|
|**CubicCurveTo**| Desenha uma curva cúbica a partir do ponto atual até a posição especificada. Representado pela classe **CubicCurveTo** do pacote `javafx.scene.shape`|
|**ArcTo**| Desenha um arco a partir do ponto atual até a posição especificada. Representado pela classe **ArcTo** do pacote `javafx.scene.shape`|

### Propriedades de objetos 2D

#### Stroke Type

```java
Rectangle rectangle = new Rectangle(20, 50, 560, 200);
rectangle.setStrokeType(StrokeType.CENTERED);
```

#### Stroke Width

```java
rectangle.setStrokeWidth(20.0);
```

#### Stroke Fill

```java
rectangle.setFill(Color.BLUE);
```

#### Stroke

```java
rectangle.setStroke(Color.RED);
```

#### Stroke Line

```java
rectangle.setStrokeLineJoin(StrokeLineJoin.ROUND);
```

#### Stroke Miler Limit

```java
rectangle.setStrokeMiterLimit(5.0);
```

#### Stroke Line Cap

```java
rectangle.setStrokeLineCap(StrokeLineCap.BUTT);
```

#### Smooth

```java
rectangle.setSmooth(false);
```

### Operação em objetos 2D

Se adicionarmos duas forma a um grupo, a segunda irá sobrepor a primeiro. Além das transformações *rotate, scale, translate etc* e das transições, *animations*, também podemos fazer as operações **Union, Subtraction e Intersection**.

|Operação|Descrição|
|:---|:---|
|**Union**|Tem como entrada duas ou mais formas, retorna a área ocupada por elas|
|**Intersection**|Tem como entrada duas ou mais formas, retorna a área de interseção entre elas|
|**Subtraction**|Tem como entrada duas ou mais formas, retorna a área da primeira excluindo a sobreposta pelas demais|

## Text

O **text node** é representado pela classe **Text** do pacote `javafx.scene.shape`, ela herda a classe **Shape** de `javafx.scene.shape`. Sendo assim, além das propriedades de texto ela tem propriedades dos **shape nodes**.

### Criando um text node

Criando uma instância da classe **Text**

```java
Text text = new Text();
```

Podemos adicionar o texto com o método `setText()`

```java
text.setText("Brian - Gui");
```

Também podemos definir a posição de origem com os métodos `setX()` e `setY()`

```java
text.setX(200);
text.setY(150);
```

### Font do texto

Alteramos a fonte do texto com o método `setFont()` que recebe um objeto do tipo **Font** do pacote `javafx.scene.text`. A classe **Font** possui o método estático `font()` que aceita quatro parâmetros:

* **family** - String com o nome da familia da fonte.
* **weight** - Representa o "peso" da fonte, que pode ser *FontWeight.BLACK, .BOLD, .EXTRA_BOLD, .EXTRA_LIGHT, .LIGHT, .MEDIUM, .NORMAL, .SEMI_BOLD, .THIN*
* **posture** - Representa a "postura" da fonte, pode ser *FontPosture.REGULAR, .ITALIC*
* **size** - Representa o tamanho da fonte.

```java
text.setFont(Font.font("verdana", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 45));
```

### Stroker e Color

A cor do texto pode ser difinida com o método `setFill()`, que foi herdado de **Shape**.

```java
text.setFill(Color.BLUEVIOLET);
```

Também é possível definir o *stroke* com:

```java
text.setStrokeWidth(2);
text.setStroke(Color.BLACK);
```

### Aplicando text decoration

É possível riscar o texto com o método `setStrikethrough()` e sublinhar com `setUnderline()`

```java
text2.setStrikethrough(true);
text3.setUnderline(true);
```

### Text - Resultado

![teste-texto](img/teste-texto.png)
