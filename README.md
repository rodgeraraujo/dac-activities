# DAC Evaluative Activities

## Session Beans
### Scope:

>  Develop an application that meets the following requirements for **Album** and **Band** entities. The functionality must be available with UI (user interface) with a usable template. Other information can be entered via SQL script. 

### Functional requirements:
- **RF01**: Manage Entities. (Register and Remove) 
- **RF02**: Add Bands from a playlist. (Before finalized)
- **RF03**: Remove Bands from a playlist. (Before finalized)
- **RF04**: Search and List Bands by the name of their Members.
- **RF05**: Provide a showcase with featured Bands.

### Notes:
- A playlist is a temporary storage of Bands. This data may not be available in the web session (HttpSession).
- Whenever a new Band is added, three featured Bands should appear randomly in the web interface.

___

## Contact List - Docker and Java Sever Faces
### Scope:

>  Develop an application that meets the following requirements for the **Contact** entity. The features need to be available with UI (user interface) with a usable template in a Web environment. 

### Functional requirements:
- **RF01**: Login.
- **RF02**: Log Off.
- **RF03**: Search for a contact by name.
- **RF04**: List the contacts in alphabetical order.
- **RF05**: Group the contacts by the first letter of their name.
- **RF06**: Register a new contact.
- **RF07**: Edit an existing contact.
- **RF08**: Delete an existing contact.


### Notes:
- The application must be implemented in pairs using Java Server Faces and its implementation must be managed by Docker.

___

## Mapping JPA - Mapping and Entity Relationship
### Scope:

>  Develop an application that meets the following scenarios and their requirements. 

#### Scenario One - Movies:
> In a context of Films and considering that it is necessary to be registered the information about: Movie (Code, Title, Year, Genre, Director); Actor (Code, Name, Gender, Nationality); Event (Code, Name, Address, Year); and, the following conditions were observed: A movie starring one or more actors; A movie can receive a note in each event; Each actor can make romantic pair with another actor.
##### Requiriments:
- For the above description, develop: the DER, the classes and their respective relationships.


#### Scenario Two - Naval:
> For this scenario consider the following DER.

<img src="/dac-mapping/Diagram ER/dac-mapping-scenario2.png"
     alt="Markdown Monster icon"
     style="float: left; margin-right: 10px;" />

##### Requiriments:
- For the above description, develop: the classes and their respective relationships.
- Class diagram.
- Schedule (persists) a transport of a cargo from Cajazeiras to Joao Pessoa, on October 23 with a value of R $ 2,500, on a Ship commanded by Captain Jack Sparrow.

#### Scenario Three - Workshop:
> For this scenario, each workshop must state its location: street, neighborhood, city, and we must also store the balance that each workshop has. A workshop has several employees. From each employee we must know the name, CPF, RG, salary, and what role it plays (Employee or Manager). In a workshop you can perform several repairs, being important to know the value, when it was performed and which employee performed the repair.

##### Requiriments:
- To describe the workshop develop: the classes, their respective mappings and a class diagram that represents the modeled domain. Using the created DAO class, save and remove the ``Repair`` entity.
- Diagram Entity Relationship.

##### Result:
The **DER** for this scenario.
<img src="/dac-mapping/Diagram ER/dac-mapping-scenario3.png"
     alt="Markdown Monster icon"
     style="float: left; margin-right: 10px;" />
     *Powered by **MySQL Workbench***.

___

#### Team composed by:

- Rogério Araújo ([@rodgeraraujo](https://github.com/rodgeraraujo))
- Fernanda Vieira ([@fernandasj](https://github.com/fernandasj))

#### License:

- [MIT](LICENSE)