queryByPage
===
SELECT 
@pageTag(){
    * 
@}
FROM user 
WHERE 1=1;

select
===
select * from user where 1=1
@if(!isEmpty(age)){
and age = #{age}
@}
@if(!isEmpty(name)){
and name = #{name}
@}
@if(!isEmpty(id)){
and id = #{id}
@}
