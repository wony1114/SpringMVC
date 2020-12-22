/**
var map = new HashMap<>();|
var cmm = cmm || {}
 */

var cmm = cmm || {}
cmm = (()=>{
	const init = ctx => {
		alert(`즉시실행성공!!${ctx}`)
		$('.move-home').click(e => {location.href = '/'})
		$('#manager_register').click(e => { location.href = `${ctx}/transfer/sym/mgr/register`})
		$('#teacher_register').click(e => { location.href = `${ctx}/transfer/sym/tea/register`})
	}
	return {init}
})()