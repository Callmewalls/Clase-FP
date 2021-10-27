import java.io.*;

%%

%class IniParser
%standalone


%state COMM, MEM, MEM015, MEM16,MEM17,MEM19,MEM20,MEM21, MEMMA

dig=[0-9]

mem={dig}({dig})
sign="{"\"{dig}{dig}{dig}{dig}"\"}"



%{
String res="";
%}
%%


" "  { System.out.println("blank"); }

{mem} {
        String aux=yytext().substring(0);      
        res=yytext();
        System.out.println("value: " +yytext());

        if (aux.length() >0){
         if(aux.equals("MA"))
        {
            yybegin(MEMMA);
        }
        else
        {
			Integer nmem=Integer.valueOf(aux); 

            if(nmem<15)
			{          
				yybegin(MEM015);
			}

			if(nmem==16)
			{				
				yybegin(MEM16);
			}
			
			if(nmem==17)
			{

				yybegin(MEM17);
			}
			
			if(nmem==19)
			{
				yybegin(MEM19);
			}
			
			if(nmem==20)
			{
				yybegin(MEM20);
			}
			
			if(nmem==21)
			{           
				yybegin(MEM21);
			}

        }
        System.out.println(aux);
        }

       
              
      }

<MEM015>
{
.|\n	{System.out.println("State mem 015");}
}

<MEM16>
{
.|\n	{System.out.println("State mem 016");}
}

<MEM17>
{
.|\n	{System.out.println("State mem 017");}
}

<MEM19>
{
.|\n	{System.out.println("State mem 019");}
}

<MEM20>
{
.|\n	{System.out.println("State mem 020");}
}

<MEM21>
{
.|\n	{System.out.println("State mem 021");}
}



<<EOF>> {System.out.println("Finish");System.exit(0);}

.|\n {}