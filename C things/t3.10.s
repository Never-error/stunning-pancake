	.file	"t3.10.c"
	.text
	.globl	_arith2
	.def	_arith2;	.scl	2;	.type	32;	.endef
_arith2:
LFB0:
	.cfi_startproc
	movl	12(%esp), %eax
	subl	$1, %eax
	ret
	.cfi_endproc
LFE0:
	.ident	"GCC: (MinGW.org GCC-6.3.0-1) 6.3.0"
