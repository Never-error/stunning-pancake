	.file	"t3.9.c"
	.text
	.globl	_t3_9
	.def	_t3_9;	.scl	2;	.type	32;	.endef
_t3_9:
LFB0:
	.cfi_startproc
	movl	4(%esp), %eax
	sall	$4, %eax
	movl	8(%esp), %ecx
	sarl	%cl, %eax
	ret
	.cfi_endproc
LFE0:
	.ident	"GCC: (MinGW.org GCC-6.3.0-1) 6.3.0"
