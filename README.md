### Escuela Colombiana de Ingeniería

### Procesos de Desarrollo de Software

### Desarrollo Dirigido por Pruebas + DIP + DI + Contenedores Livianos


Para este taller se va a trabajar sobre el juego del ahorcado.

El sistema actual de puntuación del juego comienza en 100 puntos y va
descontando 10 puntos cada vez que se propone una letra incorrecta.

Algunos usuarios han propuesto diferentes esquemas para realizar la
puntuación, los cuales se describen a continuación:

* OriginalScore: 
    * Es el esquema actual, se inicia con 100 puntos.
    * No se bonifican las letras correctas.
    * Se penaliza con 10 puntos con cada letra incorrecta.
    * El puntaje minimo es 0.

* BonusScore: 
    * El juego inicia en 0 puntos.
    * Se bonifica con 10 puntos cada letra correcta.
    * Se penaliza con 5 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    
* PowerBonusScore:
    * El juego inicia en 0 puntos.
    * La $i-ésima$ letra correcta se bonifica con $5^i$.
    * Se penaliza con 8 puntos cada letra incorrecta.
    * El puntaje mínimo es 0
    * Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es
      500.

Lo anterior, se traduce en el siguiente modelo, donde se aplica el
principio de inversión de dependencias:


![](img/model.png)


### Parte I

1. Clone el proyecto (no lo descargue!).

![image](https://user-images.githubusercontent.com/108955358/192125713-3a490cbe-3eab-4ad8-adbf-efbf65f27782.png)
![image](https://user-images.githubusercontent.com/108955358/192125720-57317067-ef57-4619-9bbf-1fe655d155a2.png)

   
2. A partir del código existente, implemente sólo los cascarones del
   modelo antes indicado.
   
![WhatsApp Image 2022-09-25 at 9 59 10 AM](https://user-images.githubusercontent.com/108955358/192169163-49b84d88-107f-48d1-9789-fab6cc566530.jpeg)
![WhatsApp Image 2022-09-25 at 9 59 26 AM](https://user-images.githubusercontent.com/108955358/192169167-2190cbbf-d88d-42db-ab3d-738dd90bd936.jpeg)
![WhatsApp Image 2022-09-25 at 10 00 00 AM](https://user-images.githubusercontent.com/108955358/192169175-6afcef5b-0306-40c8-a57b-84c6bf06dab8.jpeg)
![WhatsApp Image 2022-09-25 at 10 00 17 AM](https://user-images.githubusercontent.com/108955358/192169178-28415d7a-27fd-4236-b68c-591efd3a1254.jpeg)


3. Haga la especificación de los métodos calculateScore (de las tres
   variantes de GameScore), a partir de las especificaciones
   generales dadas anteriormente. Recuerde tener en cuenta: @pre,
   @pos, @param, @throws.
   
   ![image](https://user-images.githubusercontent.com/108955358/192173797-d3d9ecf3-e230-4995-a9a5-64929237d586.png)


4. Haga commit de lo realizado hasta ahora. Desde la terminal:

	```bash		
	git add .			
	git commit -m "especificación métodos"
	```
	
![image](https://user-images.githubusercontent.com/108955358/192173824-dadce2b9-53b7-4343-8823-849deb83d86b.png)


5. Actualice el archivo `pom.xml` e incluya las dependencias para la ultima versión de JUnit y la versión del compilador de Java a la versión 8 .

![image](https://user-images.githubusercontent.com/108955358/192125862-d3d67b78-ddb9-402d-8f0d-e6ee24c76d80.png)

   

6. Teniendo en cuenta dichas especificaciones, en la clase donde se
   implementarán las pruebas (GameScoreTest), en los
   comentarios iniciales, especifique las clases de equivalencia para
   las tres variantes de GameScore, e identifique
   condiciones de frontera. 

![image](https://user-images.githubusercontent.com/108955358/192174112-09cc10b7-7d03-4cc4-9373-b18618302195.png)
![image](https://user-images.githubusercontent.com/108955358/192174124-c02a5a83-ad54-4bfa-8f42-5565ff733403.png)

7. Para cada clase de equivalencia y condición de frontera, implemente
   una prueba utilizando JUnit.
   
   ![image](https://user-images.githubusercontent.com/108955358/192174179-bf774233-628b-4d4c-ae10-fe917864a96d.png)
   ![image](https://user-images.githubusercontent.com/108955358/192174189-548a58e2-2382-4f6f-b42f-ac612e937753.png)
   ![image](https://user-images.githubusercontent.com/108955358/192174205-c5948bde-696e-44de-a240-e1b198228619.png)
   ![image](https://user-images.githubusercontent.com/108955358/192174215-02ebf1c4-1af5-420a-89d6-10f916a464a5.png)
   ![image](https://user-images.githubusercontent.com/108955358/192174230-85379118-720f-46b8-9e19-fae1f32d7c87.png)
   ![image](https://user-images.githubusercontent.com/108955358/192174237-5d082aa7-152f-4c39-8076-f521e087f501.png)




8. Haga commit de lo realizado hasta ahora. Desde la terminal:

	```bash		
	git add .			
	git commit -m "implementación pruebas"
	```
	
	![image](https://user-images.githubusercontent.com/108955358/192174253-77894eed-cf78-49db-8838-3b3a3519108a.png)

9. Realice la implementación de los 'cascarones' realizados anteriormente.
   Asegúrese que todas las pruebas unitarias creadas en los puntos anteriores
   se ejecutan satisfactoriamente.
   ![image](https://user-images.githubusercontent.com/108955358/192174271-0763874b-6aae-4dce-b1b7-1baf4ba30753.png)
   

10. Al finalizar haga un nuevo commit:

	```bash		
	git add .			
	git commit -m "implementación del modelo"
	```
	![image](https://user-images.githubusercontent.com/108955358/192174313-d6d8df6d-334f-4848-a784-a0f590227249.png)

11. Para sincronizar el avance en el respositorio y NO PERDER el trabajo, use
    el comando de GIT para enviar los cambios:

```bash	
	git push <URL Repositorio>	
```
![image](https://user-images.githubusercontent.com/108955358/192174330-d732cf75-a1b0-4346-b65b-d1b4eceecd6b.png)


### Parte II

Actualmente se utiliza el patrón FactoryMethod
que desacopla la creación de los objetos para diseñar un juego
de ahorcado (revisar createGUIUsingFactoryMethod en SwingProject, el
constructor de la clase GUI y HangmanFactoryMethod).

En este taller se va a utilizar un contenedor liviano ([GoogleGuice](https://github.com/google/guice)) el cual soporta la inyección de las dependencias.

1. Utilizando el HangmanFactoryMethod (MétodoFabrica) incluya el
   OriginalScore a la configuración.

Incorpore el Contenedor Liviano Guice dentro del proyecto:

* Revise las dependencias necesarias en el pom.xml.

![image](https://user-images.githubusercontent.com/108955358/192174439-ede596e9-a179-4228-9df4-138fea47aced.png)

* Modifique la inyección de dependencias utilizando guice en lugar del
  método fábrica..
  
  ![image](https://user-images.githubusercontent.com/108955358/192174659-156d60c1-a889-4709-b336-0aaf508ad061.png)

* Configure la aplicación de manera que desde el programa SwingProject
  NO SE CONSTRUYA el Score directamente, sino a través de Guice, asi
  mismo como las otras dependencias que se están inyectando mediante
  la fabrica.
  
  ![image](https://user-images.githubusercontent.com/108955358/192174901-156efdb1-f652-4b42-8eaf-ed9a9e8711d8.png)

* Mediante la configuración de la Inyección de
  Dependencias se pueda cambiar el comportamiento del mismo, por
  ejemplo:
	* Utilizar el esquema OriginalScore.
	* Utilizar el esquema BonusScore.
	* Utilizar el idioma francés.
    * Utilizar el diccionario francés.
	* etc...

	![image](https://user-images.githubusercontent.com/108955358/192174957-758906d5-1a5a-4ecc-8dfe-c7b413264d49.png)

* Para lo anterior, [puede basarse en el ejemplo dado como
  referencia](https://github.com/PDSW-ECI/LightweighContainers_DepenendecyInjectionIntro-WordProcessor).
