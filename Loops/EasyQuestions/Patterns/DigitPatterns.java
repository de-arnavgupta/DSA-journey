package codeforces.Loops.EasyQuestions.Patterns.EasyQuestion;

import java.util.* ;

public class DigitPatterns
{
    public static void main(String[] args )
    {
        Scanner obn= new Scanner(System.in ) ;
        int N, R ;
        N= obn.nextInt() ;
        R= obn.nextInt() ;
        String s= Integer.toString(N) ;
        for(int i= 0 ; i<s.length() ; ++i )
        {
            char ch= s.charAt(i ) ;
            if(ch=='0' )
            {
                for(int j= 1 ; j<=R ; ++j )
                {
                    if(j==1 || j==R )
                    {
                        for(int k= 1 ; k<=R ; ++k )
                        {
                            System.out.print("*" ) ;
                        }
                    }
                    else
                    {
                        System.out.print("*" ) ;
                        for(int k=1 ; k<=(R-2) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                        System.out.print("*" ) ;
                    }
                    System.out.println() ;
                }
            }
            else if(ch=='1' )
            {
                for(int j=1 ; j<=R ; ++j )
                {
                    System.out.println("*" ) ;
                }
            }
            else if(ch=='2' )
            {
                for(int j=1 ; j<=R ; ++j )
                {
                    if(j==1 || j==((R+1)/ 2) || j==R )
                    {
                        for(int k= 1 ; k<=R ; ++k )
                        {
                            System.out.print("*" ) ;
                        }
                    }
                    else if( j<((R+1 )/ 2 ) )
                    {
                        for(int k= 1 ; k<=(R-1 ) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                        System.out.print("*" ) ;
                    }
                    else if(j>((R+ 1 )/ 2 ) )
                    {
                        System.out.print("*" ) ;
                        for(int k=1 ; k<=(R-1) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                    }
                    System.out.println() ;
                }
            }
            else if(ch=='3' )
            {
                for(int j=1 ; j<=R ; ++j )
                {
                    if(j==1 || j==((R+1 )/ 2 ) || j==R )
                    {
                        for(int k= 1 ; k<=R ; ++k )
                        {
                            System.out.print("*" ) ;
                        }
                    }
                    else
                    {
                        for(int k= 1 ; k<=(R-1) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                        System.out.print("*" ) ;
                    }
                    System.out.println() ;
                }
            }
            else if(ch=='4' )
            {
                for(int j=1 ; j<=R ; ++j )
                {
                    if(j<((R+ 1)/ 2) )
                    {
                        System.out.print("*" ) ;
                        for(int k= 1 ; k<=(R-2 ) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                        System.out.print("*" ) ;
                    }
                    else if(j==((R+1 )/ 2) )
                    {
                        for(int k=1 ; k<=R ; ++k )
                        {
                            System.out.print("*" ) ;
                        }
                    }
                    else if(j>((R+ 1 )/ 2 ))
                    {
                        for(int k=1 ; k<=(R-1 ) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                        System.out.print("*" ) ;
                    }
                    System.out.println() ;
                }
            }
            else if(ch=='5' )
            {
                for(int j= 1 ; j<=R ; ++j )
                {
                    if(j==1 || j==((R+1 )/ 2 ) || j==R )
                    {
                        for(int k= 1 ; k<=R ; ++k )
                        {
                            System.out.print("*" ) ;
                        }
                    }
                    else if(j<((R+ 1 ) / 2 ) )
                    {
                        System.out.print("*" ) ;
                        for(int k= 1 ; k<=(R-1) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                    }
                    else if(j>((R+ 1 )/ 2 ) )
                    {
                        for(int k= 1 ; k<=(R-1 ) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                        System.out.print("*" ) ;
                    }
                    System.out.println() ;
                }
            }
            else if(ch=='6' )
            {
                for(int j=1 ; j<=R ; ++j )
                {
                    if(j==1 || j==((R+ 1 )/ 2 ) || j==R )
                    {
                        for(int k= 1 ; k<=R ; ++k )
                        {
                            System.out.print("*" ) ;
                        }
                    }
                    else if(j<((R+ 1 )/ 2 ) )
                    {
                        System.out.print("*" ) ;
                        for(int k= 1 ; k<= (R-1 ) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                    }
                    else if(j>((R+ 1 )/ 2 ) )
                    {
                        System.out.print("*" ) ;
                        for(int k=1 ; k<=(R-2 ) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                        System.out.print("*" ) ;
                    }
                    System.out.println() ;
                }
            }
            else if(ch=='7' )
            {
                for(int j= 1 ; j<=R ; ++j )
                {
                    if(j==1 )
                    {
                        for(int k= 1 ; k<=R ; ++k )
                        {
                            System.out.print("*" ) ;
                        }
                    }
                    else if(j> 1 )
                    {
                        for(int k= 1 ; k<=(R- 1 ) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                        System.out.print("*" ) ;
                    }
                    System.out.println() ;
                }
            }
            else if(ch=='8' )
            {
                for(int j= 1 ; j<=R ; ++j )
                {
                    if(j==1 || j==((R+ 1 )/ 2 ) || j==R )
                    {
                        for(int k= 1 ; k<=R ; ++k )
                        {
                            System.out.print("*" ) ;
                        }
                    }
                    else if(j<((R+ 1)/ 2 ) || j>((R+ 1 )/ 2 ) )
                    {
                        System.out.print("*" ) ;
                        for(int k= 1 ; k<=(R-2 ) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                        System.out.print("*" ) ;
                    }
                    System.out.println() ;
                }
            }
            else if(ch=='9' )
            {
                for(int j= 1 ; j<=R ; ++j )
                {
                    if(j==1 || j==((R+1)/ 2 ) || j==R )
                    {
                        for(int k= 1 ; k<=R ; ++k )
                        {
                            System.out.print("*" ) ;
                        }
                    }
                    else if(j<((R + 1 )/ 2 ) )
                    {
                        System.out.print("*" ) ;
                        for(int k= 1 ; k<=(R-2 ) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                        System.out.print("*" ) ;
                    }
                    else if(j>((R+ 1 )/ 2 ) )
                    {
                        for(int k= 1 ; k<=(R-1 ) ; ++k )
                        {
                            System.out.print(" " ) ;
                        }
                        System.out.print("*" ) ;
                    }
                    System.out.println() ;
                }
            }
            System.out.println() ;
        }
    }
}