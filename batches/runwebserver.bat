cls
set options=webserver
set currentfolder=%cd%
set srcfolder=%currentfolder%/../src
set runablefolder=../../vxlisp/dist
set runable=vxlisp_win64.exe
rem set runablefolder=../../vxlisp/src
rem set runable=go run .
set pipe=
rem set pipe=> %currentfolder%/run.log
cd %runablefolder%
%runable% %options% :path %srcfolder% %pipe%
cd %currentfolder%
