# Stereo System

This exercise was tasked to me by CodeClan, Glasgow where I studied towards a PDA Level 8 in Professional Software Development. The exercise brief can be found below.

## Brief

You are being asked to model a stereo system made up of separate components. The stereo will contain a radio and at least one of the following: record deck, CD player, cassette deck. It will also be possible to connect an external sound source e.g. mp3 player, phone.

- Create a class Radio, which has a method tune. This may simply return a string of the station being tuned to
- Create classes for different components e.g. record deck, CD player etc
- Each class will have instance variables particular to that component
- A record deck may have play speeds, a CD player may have a number of CDs it can play at a time
- As the stereo is made up of separate components, each component should have its own make and model, and methods to operate them
- Create an abstract class Component which contains attributes you see as being common to all the main items in the stereo system
- Create a Stereo class, which contains all the components created above
- Create an interface IConnect. This should have a method connect which takes in an instance of a Stereo and return a string which contains the name of the stereo it is connected to
- Create a device e.g. mp3 player which implements the IConnect interface

**Possible Extensions**

- Perhaps you could add output devices e.g. speakers, headphones
