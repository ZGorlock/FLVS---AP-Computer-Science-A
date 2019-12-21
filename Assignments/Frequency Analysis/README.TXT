PROJECT TITLE: Frequency Analysis
PURPOSE OF PROJECT: Preforms a frequency analysis
VERSION or DATE: 04-12-2013
AUTHORS: Zachary Gill

**************************** P M R *********************************************
 
<+s>: Arrays and I/O was easy to remember
      
<-s>: Cant actually solve the ciphers with the program.
           
*******************************************************************************
The coding part of the project was fairly simple but the decoding of the message took more time. First I tried making an alphabet just from the frequency values, but eventually I just went though and completed words from the secret message until it was solverd.

FIRST I BELIEVE THAT THIS NATION SHOULD COMMIT ITSELF TO ACHIEVING
OAXFI A MZSAZPZ IQKI IQAF WKIAYW FQYHSV GYNNAI AIFZSO IY KGQAZPAWT 

THE GOAL BEFORE THIS DECADE IS OUT OF LANDING A MAN ON THE MOON AND
IQZ TYKS MZOYXZ IQAF VZGKVZ AF YHI YO SKWVAWT K NKW YW IQZ NYYW KWV 

RETURNING HIM SAFELY TO THE EARTH
XZIHXWAWT QAN FKOZSR IY IQZ ZKXIQ 

KEY:
A-I
B-?
C-?
D-?
E-?
F-S
G-C
H-U
I-T
J-?
K-A
L-?
M-B
N-M
O-F
P-V
Q-H
R-Y
S-L
T-G
U-?
V-D
W-N
X-R
Y-O
Z-E

1) While writing the frequency analysis program, I had a little problem formatting the printed output and file output. To resolve this problem, I reviewed the printf() cmethod.
2) The frequencies were fairly close to the ones from the plaintext. To improve the accuracy of the correspondence, I could have used a larger plaintext sample, and a larger cipher text.
3) In order to solve the cipher with the program, you could have it generate a list of possibly valid alphabets and then deciphering the secret message with each alphabet and print the result to the screen. The user would then have to choose whether the decoded message made sense or not. If not then it would move on to the next possible alphabet.