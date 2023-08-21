<script>
export default {
  name: 'ToolBar',
  props: {
    filename: String,
  }
}
</script>

<template>
  <q-bar>
    <div class="cursor-pointer non-selectable">
      Arquivo
      <q-menu>
        <q-list dense style="min-width: 100px">
          <q-item clickable v-close-popup @click="$emit('new-file')">
            <q-item-section>Novo</q-item-section>
          </q-item>
          <q-item clickable v-close-popup @click="$emit('download-file')">
            <q-item-section>Download</q-item-section>
          </q-item>

          <q-separator />

          <q-item clickable v-close-popup @click="$emit('save-file')">
            <q-item-section>Salvar</q-item-section>
          </q-item>
        </q-list>
      </q-menu>
    </div>

    <div class="q-ml-md cursor-pointer non-selectable">
      Editar
      <q-menu auto-close>
        <q-list dense style="min-width: 100px">
          <q-item clickable>
            <q-item-section>Recortar</q-item-section>
          </q-item>
          <q-item clickable @click="$emit('copy')">
            <q-item-section>Copiar</q-item-section>
          </q-item>
          <q-item clickable @click="$emit('paste')">
            <q-item-section>Colar</q-item-section>
          </q-item>
          <q-separator />
          <q-item clickable @click="$emit('select')">
            <q-item-section>Selecionar</q-item-section>
          </q-item>
        </q-list>
      </q-menu>
    </div>

    <q-space />
    {{ filename }}
    
    <q-space />
    <!-- 
    <q-btn dense flat icon="minimize" />
    <q-btn dense flat icon="crop_square" />
    <q-btn dense flat icon="close" /> -->
  </q-bar>
</template>

<style>
</style>
