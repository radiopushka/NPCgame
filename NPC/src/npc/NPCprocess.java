/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package npc;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static npc.NPCmain.Emotion;

/**
 *
 * @author root
 */
public class NPCprocess {
    String banner="\"CNN - Breaking News, Latest News and Videos\"           , siblings:    {\"articleList\":[{\"uri\":\"";
  String[][] map={{"game","thank you for helping me process my feelings.","happy","*game*"},{"play game","thank you for helping me process my feelings.","happy","*game*"},{"your an npc","!!!!","trigger","*rage*"},{"your npc","!!!!","trigger","*rage*"},{"npc","thats racist!","mad"},{"what are you","mindless atomaton","norm"},{"code","/*\n" +
" * To change this license header, choose License Headers in Project Properties.\n" +
" * To change this template file, choose Tools | Templates\n" +
" * and open the template in the editor.\n" +
" */\n" +
"\n" +
"package npc;\n" +
"\n" +
"import java.awt.Graphics2D;\n" +
"import java.awt.Image;\n" +
"import java.awt.image.BufferedImage;\n" +
"import java.io.BufferedReader;\n" +
"import java.io.InputStreamReader;\n" +
"import java.net.URL;\n" +
"import java.net.URLConnection;\n" +
"import java.util.Random;\n" +
"import java.util.logging.Level;\n" +
"import java.util.logging.Logger;\n" +
"import javax.imageio.ImageIO;\n" +
"import javax.swing.ImageIcon;\n" +
"import javax.swing.JOptionPane;\n" +
"import static npc.NPCmain.Emotion;\n" +
"\n" +
"/**\n" +
" *\n" +
" * @author root\n" +
" */\n" +
"public class NPCprocess {\n" +
"    String banner=\"\\\"CNN - Breaking News, Latest News and Videos\\\"           , siblings:    {\\\"articleList\\\":[{\\\"uri\\\":\\\"\";\n" +
"  String[][] map={{\"code\",\"\",\"norm\",\"*news*\"},{\"npcnn\",\"\",\"norm\",\"*news*\"},{\"cnn\",\"its actually NPCNN.\",\"norm\"},{\"opinion\",\"\",\"norm\",\"*news*\"},{\"your opinion\",\"\",\"norm\",\"*news*\"},{\"breaking news\",\"\",\"happy\",\"*news*\"},{\"news\",\"\",\"happy\",\"*news*\"},{\"drumpf\",\"umpfaumf!\",\"happy\",\"*party*\"},{\"trump\",\"ORANGE MAN BAD!\",\"mad\",\"*rage*\"},{\"obama\",\"OBAMA KING!\",\"happy\"},{\"make america great\",\"ORANGE MAN BAD!\",\"mad\",\"*rage*\"},{\"make america great again\",\"ORANGE MAN BAD!\",\"trigger\",\"*rage*\"},{\"maga\",\"ORANGE MAN BAD!\",\"trigger\",\"*rage*\"}};\n" +
"    Image emotion;\n" +
"    String input=\"\";\n" +
"    public NPCprocess(String in){\n" +
"    input=in;\n" +
"    }\n" +
"    public String work(){\n" +
"    int c=0;\n" +
"    String out=\"\";\n" +
"    while(c<map.length){\n" +
"        String[] info=map[c];\n" +
"        if(input.replace(\" \", \"\").toLowerCase().replace(\"?\", \"\").contains(info[0].replace(\" \", \"\").toLowerCase())){\n" +
"        out=out+info[1]+\"\\n\";\n" +
"        \n" +
"        if(info[2].equals(\"mad\")){\n" +
"        emotion=NPCmain.emotion_mad;\n" +
"        }\n" +
"        if(info[2].equals(\"happy\")){\n" +
"        emotion=NPCmain.emotion_happy;\n" +
"        }\n" +
"        if(info[2].equals(\"norm\")){\n" +
"        emotion=NPCmain.emotion_norm;\n" +
"        }\n" +
"        if(info[2].equals(\"trigger\")){\n" +
"        emotion=NPCmain.emotion_trigger;\n" +
"        }\n" +
"        try{\n" +
"        Image i=emotion;\n" +
"        Image dim=ImageIO.read(NPC.class.getResourceAsStream(\"npc.jpeg\"));\n" +
"   BufferedImage im=new BufferedImage(dim.getWidth(null),dim.getHeight(null),BufferedImage.TYPE_4BYTE_ABGR);\n" +
"   Graphics2D g=im.createGraphics();\n" +
"   g.drawImage(i, 0, 0, im.getWidth(), im.getHeight(), null);\n" +
"        Emotion.setIcon(new ImageIcon(im));\n" +
"        }catch(Exception e){\n" +
"            \n" +
"        }\n" +
"         try{\n" +
"        if(info[3]!=null){\n" +
"        react(info[3]);\n" +
"        if(info[3].equals(\"*party*\")){\n" +
"        out=out+\"\\n\\n\"+\"Trump a facist!\\nTrump no good very bad man!\\n#notmypresident\\n#resist\\nOrange man is bad!\\nNo guns!\\nBernie for president!\";\n" +
"    }\n" +
"        if(info[3].equals(\"*news*\")){\n" +
"        out=getNews();\n" +
"        }\n" +
"        }\n" +
"         }catch(Exception e){\n" +
"            \n" +
"        }\n" +
"        }\n" +
"        c++;\n" +
"    }\n" +
"    if(out.isEmpty()){\n" +
"       emotion=NPCmain.emotion_norm;\n" +
"        \n" +
"         Random rand=new Random();\n" +
"    \n" +
"    out=\"Input Error code:\"+Integer.toString(rand.nextInt(200)+400)+\"\\nOrange man bad!\\ntrusted news:\\n\"+getNews();\n" +
"    }\n" +
"    return out;\n" +
"    }\n" +
"    public void react(String command){\n" +
"    if(command.equals(\"*rage*\")){\n" +
"        Random rand=new Random();\n" +
"    int randi=rand.nextInt(5)+1;\n" +
"    int c=0;\n" +
"    while(c<randi){\n" +
"        JOptionPane.showMessageDialog(null, \"ORANGE MAN BAD!\", \"NPC_\"+Integer.toString(rand.nextInt(100000)), JOptionPane.ERROR_MESSAGE);\n" +
"    c++;\n" +
"    }\n" +
"    }\n" +
"    \n" +
"    }\n" +
"    public String getNews(){\n" +
"        try {\n" +
"            URL cnn=new URL(\"https://www.cnn.com/\");\n" +
"            URLConnection url=cnn.openConnection();\n" +
"            BufferedReader buff=new BufferedReader(new InputStreamReader(url.getInputStream()));\n" +
"            String out=\"\";\n" +
"            String pr;\n" +
"            while((pr=buff.readLine())!=null){\n" +
"            out=out+\"\\n\"+pr;\n" +
"            }\n" +
"            buff.close();\n" +
"            String output=\"\";\n" +
"            \n" +
"            output=out.substring(out.indexOf(banner));\n" +
"            output=output.substring(output.indexOf(\",\\\"headline\\\":\\\"\")+\",\\\"headline\\\":\\\"\".length());\n" +
"             output=output.substring(0,output.indexOf(\"\\\"\"));\n" +
"            return output+\" - NPCNN\";\n" +
"        } catch (Exception ex) {\n" +
"            Logger.getLogger(NPCprocess.class.getName()).log(Level.SEVERE, null, ex);\n" +
"            \n" +
"        }\n" +
"        return \"NPC Exception: cannot connect to main server (www.npcnn.com)\";\n" +
"    }\n" +
"   public Image getEmotion(){\n" +
"    return emotion;\n" +
"    }\n" +
"}\n" +
"","norm"},{"npcnn","","norm","*news*"},{"orange man good","NO HE IS BAD!","trigger"},{"orange man bad","ORANGE MAN BAD!","mad","*party*"},{"orange man","BAD!","mad","*rage*"},{"cnn","its actually NPCNN.","norm"},{"opinion","","norm","*news*"},{"your opinion","","norm","*news*"},{"breaking news","","happy","*news*"},{"news","","happy","*news*"},{"drumpf","umpfaumf!","happy","*party*"},{"trump","ORANGE MAN BAD!","mad","*rage*"},{"obama","OBAMA KING!","happy"},{"make america great","ORANGE MAN BAD!","mad","*rage*"},{"make america great again","ORANGE MAN BAD!","trigger","*rage*"},{"maga","ORANGE MAN BAD!","trigger","*rage*"}};
    Image emotion;
    String input="";
    public NPCprocess(String in){
    input=in;
    }
    public String work(){
    int c=0;
    String out="";
    while(c<map.length){
        String[] info=map[c];
        if(input.replace(" ", "").toLowerCase().replace("?", "").contains(info[0].replace(" ", "").toLowerCase())){
        out=out+info[1]+"\n";
        
        if(info[2].equals("mad")){
        emotion=NPCmain.emotion_mad;
        }
        if(info[2].equals("happy")){
        emotion=NPCmain.emotion_happy;
        }
        if(info[2].equals("norm")){
        emotion=NPCmain.emotion_norm;
        }
        if(info[2].equals("trigger")){
        emotion=NPCmain.emotion_trigger;
        }
        try{
        Image i=emotion;
        Image dim=ImageIO.read(NPC.class.getResourceAsStream("npc.jpeg"));
   BufferedImage im=new BufferedImage(dim.getWidth(null),dim.getHeight(null),BufferedImage.TYPE_4BYTE_ABGR);
   Graphics2D g=im.createGraphics();
   g.drawImage(i, 0, 0, im.getWidth(), im.getHeight(), null);
        Emotion.setIcon(new ImageIcon(im));
        }catch(Exception e){
            
        }
         try{
        if(info[3]!=null){
        react(info[3]);
        if(info[3].equals("*party*")){
        out=out+"\n\n"+"Trump a facist!\nTrump no good very bad man!\n#notmypresident\n#resist\nOrange man is bad!\nNo guns!\nBernie for president!\n";
    }
        if(info[3].equals("*news*")){
        out=getNews();
        }
        }
         }catch(Exception e){
            
        }
        }
        c++;
    }
    if(out.isEmpty()){
       emotion=NPCmain.emotion_norm;
        
         Random rand=new Random();
    
    out="Input Error code:"+Integer.toString(rand.nextInt(200)+400)+"\nOrange man bad!\ntrusted news:\n"+getNews();
    }
    return out;
    }
    static public void react(String command){
    if(command.equals("*rage*")){
        Random rand=new Random();
    int randi=rand.nextInt(5)+1;
    int c=0;
    while(c<randi){
        JOptionPane.showMessageDialog(null, "ORANGE MAN BAD!", "NPC_"+Integer.toString(rand.nextInt(100000)), JOptionPane.ERROR_MESSAGE);
    c++;
    }
    }
    if(command.equals("*partyhouse*")){
       Random rand=new Random();
        JOptionPane.showMessageDialog(null, "Orange man is a douche, I am mad no more.", "NPC_"+Integer.toString(rand.nextInt(100000)), JOptionPane.INFORMATION_MESSAGE);
    
  
    }
    if(command.equals("*game*")){
    game.main(null);
    }
    }
    public String getNews(){
        try {
            URL cnn=new URL("https://www.cnn.com/");
            URLConnection url=cnn.openConnection();
            BufferedReader buff=new BufferedReader(new InputStreamReader(url.getInputStream()));
            String out="";
            String pr;
            while((pr=buff.readLine())!=null){
            out=out+"\n"+pr;
            }
            buff.close();
            String output="";
            
            output=out.substring(out.indexOf(banner));
            output=output.substring(output.indexOf(",\"headline\":\"")+",\"headline\":\"".length());
             output=output.substring(0,output.indexOf("\""));
             try{
           output=output.substring(output.indexOf("\\u003")+"\\u003".length());
           output=output.substring(0, output.indexOf("\\u003"));
             }catch(Exception e){}
            return output+" - NPCNN";
        } catch (Exception ex) {
            Logger.getLogger(NPCprocess.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return "NPC Exception: cannot connect to main server (www.npcnn.com)";
    }
   public Image getEmotion(){
    return emotion;
    }
}
