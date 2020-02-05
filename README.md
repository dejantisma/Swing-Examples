## Swing Examples

I picked 5 programs from

https://github.com/janbodnar/Java-Swing-Examples

I messed around with the files, compiling and running them. I changed some lines in a few of them to get a better understanding.

In AbsoluteLayoutEx.java, I added
```
closeBtn.addActionListener((event) -> System.exit(0));
```
so the close button actually *closes*. As well as 
`import java.awt.*;` so that I could use `Dimension` to get the screensize and use that information for the bounds later.

Ex.
```
Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
var width = (int)d.getWidth();
var height = (int)d.getHeight();
var okBtn = new JButton("OK");
okBtn.setBounds(width/2 - 80, height/2, 80, 25);

```
Some of the other files remain unchanged, again from the Swing tutorial from [zetcode](http://zetcode.com/tutorials/javaswingtutorial/)