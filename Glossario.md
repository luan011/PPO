Construtor
os construtores s�o os respons�veis por criar o objeto em mem�ria ou instanciar a classe que foi definida
 
class test{
    public test() {
        System.out.println(" Construtor");
    }
}
Instancia��o
 
Instancia��o � quando se faz uma copia de uma classe existente
 
public class Instanciacao {
    private Menu menu= new Menu ();
}
Palavra reservada new
Usa-se new para instanciar objetos
 
Palavra reservada instanciof
O operador instanceof serve para verificar se determinado objeto � uma inst�ncia de um determinado tipo classe ou interface.
 
Encapsulamento
� uma forma de reaproveitar c�digo e tamb�m esconde-lo
 
Palavra reservada this
 
� usado para fazer auto-refer�ncia ao pr�prio contexto em que se encontra e sempre ser� a pr�pria classe ou o objeto j� instanciado.
 
Getters/Setters
GET � quando voc� quer pegar um valor.
SET � quando voc� deseja setar ou enviar algo, algum valor.
 
 
Palavra reservada public/private
 
Public todos tem acesso a classe
 No Private a �nica classe que tem acesso ao atributo � a pr�pria classe que o define
public class Test{
    public int Publico;
    private int Privado;
}
 
Assinatura de m�todo
A assinatura � o jeito de identificar um m�todo de forma �nica.Em linguagens onde v�rios m�todos podem ter o mesmo nome, voc� precisa ter uma outra forma de evitar a ambiguidade.
 
Sobrecarga de m�todo
 
Sobrecarga de m�todo permite a exist�ncia de v�rios m�todos de mesmo nome, por�m com assinaturas levemente diferentes ou seja variando no n�mero , tipo de argumentos , no valor de retorno e at� vari�veis diferentes. 
 
Escopo de Classe
 
Escopo � o nome que se d� aos limites de uma vari�vel, em java uma vari�vel s� � valida dentro das chaves onde � declarada,se declara dentro do m�todo s� vale dentro do metodo, porem se declarada dentro da classe (como atributo) ela vale na classe inteira incluindo no m�todo 
 
public class Escopo{  
   
 private int num;  
  
  public void metodoA(){  
    int a = 0;  
    int num = 4;  
  }  
   
}  
Escopo de Objeto
 
Escopo do objeto � onde ele est�, dentro da classe, sendo um atributo, ou dentro de um m�todo, sendo uma vari�vel.
 
public static void main(String args[]){
	Aluno aluno1;
	aluno1= new Aluno(�Luan�, 19, �M�);
}
 
 
 
Relacionamento de depend�ncia
 
Ocorre quando uma classe utiliza os servi�os de outra classe
 Ocorre no m�todo da classe
 S�mbolo UML "- - - - - >".
 
Relacionamento de Agrega��o
 
� quando duas classes t�m uma rela��o todo-parte, a parte consegue existir sem o todo
 Atributo da Classe
 S�mbolo UML "-------<>"
 
Relacionamento de Composi��o
 
� quando duas classes t�m uma todo-parte, a parte n�o consegue existir sem o todo.
 Atributo da Classe
S�mbolo UML "-------<//>"
 
