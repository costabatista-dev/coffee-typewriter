# Coffee TypeWriter

![typewriter](https://github.com/costabatista/coffee-typewriter/blob/master/img/typewriter.gif)

## Description
Coffee TypeWriter is a software made for fun. Its goal is to simulate the sound effect
experienced by those who had the opportunity to have and use a typewriter.
This project was born with the purpose of achieving the nostalgic effect of
typing activity.

It's a free software under MIT license. Feel free to use and modify.
I only ask that in case of use, mention the original author.

Thanks.
____
## General explanations
Coffee Typewriter has modularity divided into two fronts:
- Capture keyboard events
- Make typewriter sounds.


### Capture  keyboard events

Capturing keyboard events is not a common thing to do in Java. That's because naturally, event capture in Java is limited to the application managed and executed by the **JVM (Java Virtual Machine).** This means
that such activity does not extend directly to events that occur at the OS layer (Windows, Linux, MacOS and others)

Thus, in order not to escape entirely from the purpose of the application, a library in Java was used whose function is to communicate the events that occur at the operating system layer with the application that runs within of the **JVM**. In this way, it is possible to observe all events that occur on the keyboard, regardless of whether they are executed about the **Java application**.

The library used for this is [JNativeHook](https://github.com/kwhat/jnativehook), which is available on github at under the GNU General Public and GNU Lesser General Public licenses.


### Typewriter effects sound emission

As the purpose of this software is not to create a sophisticated music player, a library of
third parties to take care of sound events. Thus, the Jaco MP3 Player library was used, which is available at [JacoMP3Player](http://jacomp3player.sourceforge.net). This library is licensed under the GNU Lesser General Public.
____________________________________________________


### Usage
The development of the Coffee Typewriter is purely for pleasure. A graphical interface has not yet been created. However, it is possible to make use of the functionality through the command line. Whether on Windows, Linux-based Systems
and the like, open an interface like Linux Terminal or Windows command prompt and run the following command

```console
java -jar coffee-typewriter.java
```` 
**It is necessary to have Java 1.8 or higher installed and with the configured path.**

**Feel Free to Use and Enjoy!**

![coffee](https://github.com/costabatista/coffee-typewriter/blob/master/img/coffee.gif)



### Licensing
The code for this application is available for free use. It is under the [MIT license](https://github.com/costabatista/coffee-typewriter/blob/master/LICENSE).
Feel free to use and if possible, feel free to give suggestions.



