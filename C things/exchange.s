	.file	"exchange.c"
	.text
	.globl	_exchange
	.def	_exchange;	.scl	2;	.type	32;	.endef
_exchange:
LFB0:
	.cfi_startproc
	movl	4(%esp), %edx
	movl	(%edx), %eax
	movl	8(%esp), %ecx
	movl	%ecx, (%edx)
	ret
	.cfi_endproc
LFE0:
	.ident	"GCC: (MinGW.org GCC-6.3.0-1) 6.3.0"
