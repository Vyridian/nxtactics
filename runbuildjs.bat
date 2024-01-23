cls
set currentfolder=%cd%
..\vxlisp\vxlispruntime\vxlisp_win64.exe doc srcjs testjs :path %currentfolder%/vxlisp > %currentfolder%\run.log
rem cd ../vxlisp/golang
rem go run . doc srcjs testjs :path %currentfolder%/vxlisp > %currentfolder%\run.log
cd %currentfolder%
