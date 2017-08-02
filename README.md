# This Repo is depricated
Please visit following repo https://github.com/mzaks/Entitas-Lang


# Motivation
This project explores the posibility of a language designed for entity component system architecture.
The code is stored as `.ecs` file and is transpiled to different platforms.
The project is based on [Xtext](http://www.eclipse.org/Xtext/).

# Early adopters
The project in current state is very early in development, however if you are brave early adopter, you have two options how you can try it out

## N00b just want to play around
In this case please download this [Ecplise](http://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/neon1a) package.
And put the `.jar` files located in `ECSEditorPlugins` folder into your Eclipse `dropins` folder.
For OSX users - `Eclipse.app` is a folder which you can open by right clicking on it and selecting "Show Package Contents." in Finder.

![](http://i.imgur.com/xBR0kGg.png)

Now you can start Eclipse. After you defined the workspace location and closed the welcome screen, you will see the Eclipse Workbench.
We have two options, create a new project or import. Let's start with create new project.

There are many ways how you can create a new project in Eclipse. I will describe the way which is simpler to explain.
In application menu select `File` > `New` > `Project...`
Than select `General` > `Project` 

![](http://i.imgur.com/kkV4Bc0.png)

After you created a project right click on it in `Package Explorer`.
Select `New` > `File` and enter a filename, which has `.ecs` extension.
When you click on `Finish` you will see a prompt, asking you to convert your project to Xtext project.

![](http://i.imgur.com/57dk1sJ.png)

Select yes and here we go. You can see your `ECS-Lang` editor with first error: 
`mismatched input '<EOF>' expecting 'platform'`
Let's fix that by adding follwoing statement `platform entitas_csharp_light`.

`entitas_csharp_light` is the first platform which has a usable code generator.
In order to trigger the code generation just save the file.

![](http://i.imgur.com/cU5fYWo.png)

To make it a little bit more interesting let's add type alias and two components

![](http://i.imgur.com/ZzTZIgy.png)

If you are interested in the language grammer, please have a look at this [walkthrough](https://gist.github.com/mzaks/a6ac9829cf09a65d7328d7194df29e20)
The `entitas_csharp_light` platform support only component definitions. __Systems__ support, as descrined in the walk through, is planed for `entitas_csharp`.

### Workflow for Unity3D
If you are working with Unity3D, you probably don't want to create a new project, because than you will have to copy the `src-gen` folder from your Eclipse project in to Unity project.
Instead I would recomend doing following.
Create a new folder in your Unity `Assets` folder, name it for example `ecs`.

![](http://i.imgur.com/S93QtqA.png)

Now switch to Eclipse and this time select `File` > `Import...` from application menu.
Select `General` > `Import Projects from File System or Archive`
And there, select the directory you just created in `Assets` folder.

![](http://i.imgur.com/tspxztj.png)

This way you created a virtual link. When you create a new `.ecs` file in Eclipse 

![](http://i.imgur.com/BHNcpbO.png)

it will be located in the Unity `Assets` folder, same with the `src-gen` folder.

![](http://i.imgur.com/yRNrHQ0.png)

The `shmup.ecs` file represent the definition of all components for [Entitas-Shmup](https://github.com/sschmid/Entitas-CSharp) project and can be found here (https://gist.github.com/mzaks/71a8ef5a6788b9ba0a13c50d0b97c080)

# Developers looking into code generators and coverage of other platforms
You can download the same [Ecplise](http://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/neon1a) package which I recomended before and try out to build the plugins directly.
I plan to add a better explanation how to get started with writing code generators for other platforms.
But for now just create an issue if you have a direct question.

