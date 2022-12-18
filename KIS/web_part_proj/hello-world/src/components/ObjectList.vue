<template>
  <div style="text-align: center">
    <TABLE border>
      <TR>
        <TH>Системный идентификатор поезда</TH>
        <TH>Дата и время совершения последней операции с поездом</TH>
        <TH>еср станции</TH>
        <TH>парк</TH>
      </TR>
      <ObjectRow v-for="object in objectList" v-bind:key="object.idPoezd" :object-data="object"></ObjectRow>
    </TABLE>
  </div>
</template>

<script>
import ObjectRow from "@/components/ObjectRow"
export default {
  name: "ObjectList",
  components: {
    ObjectRow
  },
  computed:{
    objectList(){
      return this.$store.getters.getObjectList
    }
  }

}
</script>

<style scoped>

</style>