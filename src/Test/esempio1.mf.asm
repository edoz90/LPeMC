// LetNode
push lab0 // prova
lfp
push 5
push 5
lfp
lfp
push 1
sub
lw
js
print
halt
lab0: // prova
cfp
lra
lfp
push -2
sub
lw
lfp
push -1
sub
lw
bless lab3
push 0
b lab5
lab3:
lfp
push -2
sub
lw
lfp
push -1
sub
lw
beq lab4
push 1
b lab5
lab4:
push 0
b lab5
lab5:
push 1
beq lab1
push 0
b lab2
lab1:
push 1
lab2:
srv
sra
pop
pop
pop
sfp
lrv
lra
js
// END prova
// END LetNode
