cls
set currentfolder=%cd%
set options=webserver
set pipe=
rem set pipe=> %currentfolder%\run.log
rem set runable=..\vxlisp\vxlispruntime\vxlisp_win64.exe
set runable=go run .
cd ../vxlisp/golang
%runable% %options% :path %currentfolder%/vxlisp %pipe%
cd %currentfolder%
