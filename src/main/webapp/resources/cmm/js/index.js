'use strict'
var cmm = cmm || {}
cmm = (()=>{
	const init = ctx => {
		localStorage.setItem('ctx', ctx)
		$('.move-home').click(e => {location.href = `${ctx}/`})
		$('#manager_register').click(e => {location.href = `${ctx}/admin/mgr/register`})
		$('#teacher_register').click(e => {location.href = `${ctx}/admin/tea/register`})
		$(`#linkedin`).click(e=>{location.href = `${ctx}/`})
		$(`#stu_join`).click(e => {location.href = `${ctx}/user/register`})
		$(`#stu_login`).click(e => {location.href = `${ctx}/user/login`})
		$(`#blog_default`).click(e => {location.href = `${ctx}/content/bbs/index`})
	}
	const goHome=()=>{
		$(`#goHome`).click(e=>{location.href = `${localStorage.getItem('ctx')}/`})
		
	}
	return {init, goHome}
})()
var wow = wow || {}
wow = (()=>{
	const init = ()=>{
		$(`#icon1`).html(`<img src="https://ibighit.com/bts/images/bts/profile/member-rm.jpg" alt="">`)
		$(`#icon2`).html(`<img src="https://ibighit.com/bts/images/bts/profile/member-jin.jpg" alt="">`)
		$(`#icon3`).html(`<img src="https://ibighit.com/bts/images/bts/profile/member-suga.jpg" alt="">`)
	}
	return {init}
})()
var mainSlider = mainSlider || {}
mainSlider = (()=>{
	const init =()=>{
		$(`#title`).text(`원어민 어학 사이트`)
		$(`#message`).text(`화상강의솔루션, 스카이프등을 이용하여 필리핀등 원어민 강사와 \n
		한국 학생간에 회화교육을 하는 사이트 구축`)
	}
	return {init}
})()