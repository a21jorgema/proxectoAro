# proxectoAro
Proxecto ED 4-2

ENUNCIADO

Crea un repositorio local Git co proxecto proxectoCirculoMvn.

Cambia o nome do autor de todas as clases do proxecto polo teu nome.

Garda no repositorio o proxecto.

Crea unha rama refactorizacion e móvete a ela. Realiza todas as refactorizacións nesa rama.

Realiza as seguintes refactorizacións sobre o proxectoCirculoMvn que dispón dunha clase de probas unitarias JUnit5. Comproba se está instalado o Maven Surefire Plugin. No caso de que non estea instalado, instálao.

Despois de realizar cada refactorización, débese comprobar coas probas unitarias que a clase segue pasando as probas.

Unha vez comprobado que tras o cambio pasa as probas, garda no repositorio o código indicando o cambio feito.

As refactorizacións son as seguintes:

Renomea o nome do proxecto a proxectoAro cambiando tamén o nome do cartafol que o contén.
Renomea a clase Circulo por Aro fixándote en renomear a clase de probas tamén e os comentarios. Previsualiza o cambio antes de confirmalo para saber exactamente o que vai cambiar. Cambia, se é necesario, utilizando Edit >Replace... todas as ocorrencias de Circulo por Aro.
Renomea o método obterArea por obterSuperficie.
Renomea os campos x e y por coordenadaX e coordenadaY.
Introduce a constante LIMITERADIO de tipo double co valor 0.0.
Cambia os parámetros do método trasladarCentro para que sexan trasladarX e trasladarY de tipo int. Fai os cambios necesarios para que o código do método permita engadir á coordenadaX o valor de trasladarX e á coordenadaY o valor de trasladarY.
Encapsula os tres campos da clase ( coordenadaX, coordenadaY, radio).
Elimina de forma segura os métodos obterX, obterY, obterRadio, establecerX, establecerY e establecerRadio que agora son innecesarios facendo os cambios necesarios no código para que sexan substituídos polos correspondentes métodos tipo get e set creados.
Fusiona a rama refactorizacion coa rama master de tal maneira que a rama master conteña todos os cambios feitos na rama refactorizacion.

Crea unha rama documentacion e móvete a ela.

Usa o analizador de javadoc para verificar se está completamente documentado o código. Documenta o código do proxecto de tal  maneira que o analizador non avise de que falta ningún comentario.

Cando remates de documentar, xera o javadoc. Tras xerar o javadoc e confirmar que a documentación é clara, garda todo o código documentado no repositorio.

Instala o plugin de NetBeans SonarLint integration for Netbeans. Revisa se algunha das suxestións que che fai SonarLint é aplicable e, se é así, aplícaa. Unha vez remates de revisar o código, garda os cambios no repositorio.

Fusiona a rama master coa rama documentacion de tal maneira que todos os cambios feitos para documentar e mellorar o código pasen á rama master.

Utiliza a conta de correo do IES San Clemente para darte de alta en GitHub se non o tes feito con anterioridade.

Crea un repositorio de nome proxectoAro en GitHub. Sincroniza o repositorio local co repositorio GitHub (usa push). Sincroniza unicamente a rama master.

A entrega será a URL do repositorio GitHub (exemplo: https://github.com/A21noemivr/proxectoAro).
