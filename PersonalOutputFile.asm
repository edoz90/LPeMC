// LetNode
push lab7 // noteq
lfp
push 2
push 2
lfp
lfp
push 1
sub
lw
js
halt
lab0: // somma
cfp
lra
lfp
push -1
sub
lw
lfp
push -2
sub
lw
add
lfp
lw
push 1
sub
lw
add
print
srv
sra
pop
pop
pop
sfp
lrv
lra
js
// END somma
lab1: // applica
cfp
lra
lfp
lfp
push -2
sub
lw
lfp
push -1
sub
lw
lfp
push -3
sub
lw
lfp
push -4
sub
lw
js
srv
sra
pop
pop
pop
pop
pop
sfp
lrv
lra
js
// END applica
lab2: // noteq
cfp
lra
lfp
push -1
sub
lw
lfp
push -2
sub
lw
beq lab5
push 1
b lab6
lab5:
push 0
lab6:
push 1
beq lab3
push 20
print
b lab4
lab3:
push 10
print
lab4:
srv
sra
pop
pop
pop
sfp
lrv
lra
js
// END noteq
lab7: // noteq
cfp
lra
lfp
push -1
sub
lw
lfp
push -2
sub
lw
beq lab10
push 1
b lab11
lab10:
push 0
lab11:
push 1
beq lab8
push 20
print
b lab9
lab8:
push 10
print
lab9:
srv
sra
pop
pop
pop
sfp
lrv
lra
js
// END noteq
// END LetNode
