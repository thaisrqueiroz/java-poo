# Star Wars Object-Oriented Programming Project
## Project Overview
This Java project demonstrates core Object-Oriented Programming (OOP) concepts using characters and elements from the Star Wars universe. The implementation showcases:
- Class abstraction and encapsulation
- Inheritance hierarchies
- Polymorphic behavior
- Interface implementation
- Abstract classes
## Technical Implementation
Core OOP Concepts Applied:
### Abstraction
Character abstract class defines common properties and behaviors
Interfaces (ForceSensitive) declare essential capabilities
### Encapsulation
Private fields with public getters/setters
Controlled access to class internals
### Inheritance
Jedi, Sith, and Resistance classes extend Character
Shared properties and methods inherited from parent class
### Polymorphism
Different character types treated uniformly as Character objects
Overridden methods provide type-specific behavior
### Interfaces
ForceSensitive defines force-related capabilities
Implemented by force-wielding characters
## Key Features
### Character System:
- Base Character class with common attributes (name, planet, language, height)
- Specialized character types through inheritance
- Polymorphic greeting and introduction methods
### Force Sensitivity:
- ForceSensitive interface for Jedi and Sith
- Force powers and training methods
- Lightsaber combat capabilities
### Resistance Fighters:
- Non-force using characters
- Demonstrate pure inheritance without interfaces
## How to Run
- Ensure you have Java 21+ and IntelliJ installed
- Clone the repository
- Open project in IntelliJ
- Run Main.java to see the demonstration
## Example Output
```bash
"💫✨ A long time ago in a galaxy far, far away...

May the force be with you. I'm Luke Skywalker.
I’m 1.75 meters tall and from the planet Tatooine.
I fought in the Galactic Civil War, the Battle of Yavin and the Battle of Endor.
Thanks to technology, we can communicate now — I speak Amatakka!
My lightsaber is green.
My master was Obi-Wan Kenobi.
My padawan was Ben Solo and Rey.

Never underestimate the power of the dark side. I'm Darth Plagueis.
I’m 2.0 meters tall and from the planet Mygeeto.
I fought in the Clone Wars.
Thanks to technology, we can communicate now — I speak Bith language!
My lightsaber is red.
My master was Darth Tenebrous.
My padawan was Darth Sidious.

For the Resistance! Nice to meet you, I'm Chewbacca.
I’m 2.3 meters tall and from the planet Kashyyyk.
I fought in the Galactic Civil War and Clone Wars.
Thanks to technology, we can communicate now — I speak Shyriiwook!"

```
