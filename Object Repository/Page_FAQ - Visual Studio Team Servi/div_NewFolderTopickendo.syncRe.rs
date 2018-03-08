<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_NewFolderTopickendo.syncRe</name>
   <tag></tag>
   <elementGuidId>9ee3d1bb-8237-43ef-afa1-a93632697767</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>k-pane</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>qwd-splitter-left-pane</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>role</name>
      <type>Main</type>
      <value>group</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>



	
		NewFolderTopic  
	kendo.syncReady(function(){jQuery(&quot;#qwd-left-panel-menu&quot;).kendoMenu({&quot;select&quot;:function(e){if(window.qwdleftPanel.menuItemsLeftPanelEvents.onModelMenuItemClick){window.qwdleftPanel.menuItemsLeftPanelEvents.onModelMenuItemClick(e);}},&quot;openOnClick&quot;:true});});

	
		
	Draft
	kendo.syncReady(function(){jQuery(&quot;#qwd-draft-treeview&quot;).kendoTreeView({&quot;dataBound&quot;:function(e){addTreeViewStyles(e.sender.dataSource.data(), e.sender, true);appendStarInAllCheckOutFiles(e.sender.dataSource.data(), e.sender,false);if(window.qwdleftPanel.leftPanelTrees.onDraftTreeDataBound){window.qwdleftPanel.leftPanelTrees.onDraftTreeDataBound(e);}},&quot;select&quot;:function(e){focusOnTree(e.sender);if(window.qwdleftPanel.leftPanelTrees.onDraftTreeItemSelect){window.qwdleftPanel.leftPanelTrees.onDraftTreeItemSelect(e);}},&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/FileManagement/PopulateDraftExplorer?types=QWizard\u0026componentName=inteGREATWebQWizard&quot;}},&quot;schema&quot;:{&quot;model&quot;:{}}}});});


	Recent
	kendo.syncReady(function(){jQuery(&quot;#qwd-recent-treeview&quot;).kendoTreeView({&quot;dataBound&quot;:function(e){addTreeViewStyles(e.sender.dataSource.data(), e.sender, true);appendStarInAllCheckOutFiles(e.sender.dataSource.data(), e.sender,false);if(window.qwdleftPanel.leftPanelTrees.onRecentTreeDataBound){window.qwdleftPanel.leftPanelTrees.onRecentTreeDataBound(e);}},&quot;select&quot;:function(e){focusOnTree(e.sender);if(window.qwdleftPanel.leftPanelTrees.onRecentTreeItemSelect){window.qwdleftPanel.leftPanelTrees.onRecentTreeItemSelect(e);}}});});


	Topic
	kendo.syncReady(function(){jQuery(&quot;#qwd-ff-treeview&quot;).kendoTreeView({&quot;select&quot;:function(e){focusOnTree(e.sender);if(window.qwdleftPanel.leftPanelTrees.onTreeItemSelect){window.qwdleftPanel.leftPanelTrees.onTreeItemSelect(e);}},&quot;expand&quot;:function(e){if(window.qwdleftPanel.leftPanelTrees.onTreeExpand){window.qwdleftPanel.leftPanelTrees.onTreeExpand(e);}},&quot;collapse&quot;:function(e){if(window.qwdleftPanel.leftPanelTrees.onTreeCollapse){window.qwdleftPanel.leftPanelTrees.onTreeCollapse(e);}},&quot;dataBound&quot;:function(e){addTreeViewStyles(e.sender.dataSource.data(), e.sender, true);appendStarInAllCheckOutFiles(e.sender.dataSource.data(), e.sender,true);if(window.qwdleftPanel.leftPanelTrees.onTreeDataBound){window.qwdleftPanel.leftPanelTrees.onTreeDataBound(e);}},&quot;change&quot;:function(e){if(window.qwdleftPanel.leftPanelTrees.onSelectedItemChangeEvent){window.qwdleftPanel.leftPanelTrees.onSelectedItemChangeEvent(e);}},&quot;dragstart&quot;:function(e){focusOnTree(e.sender);if(window.qwdleftPanel.leftPanelTrees.onTreeItemDragStartEvent){window.qwdleftPanel.leftPanelTrees.onTreeItemDragStartEvent(e);}},&quot;drop&quot;:function(e){focusOnTree(e.sender);if(window.qwdleftPanel.leftPanelTrees.onTreeItemDropEvent){window.qwdleftPanel.leftPanelTrees.onTreeItemDropEvent(e);}},&quot;dataSource&quot;:{&quot;transport&quot;:{&quot;read&quot;:{&quot;url&quot;:&quot;/FileManagement/PopulateFolderExplorer?types=QWizard\u0026componentName=inteGREATWebQWizard\u0026withCreatedInfo=False\u0026withWorkItem=False&quot;}},&quot;schema&quot;:{&quot;model&quot;:{}}},&quot;dragAndDrop&quot;:true});});

	
	kendo.syncReady(function(){jQuery(&quot;#qwdContextMenu&quot;).kendoContextMenu({&quot;select&quot;:function(e){if(window.qwdleftPanel.leftPanelTrees.onContextMenuSelect){window.qwdleftPanel.leftPanelTrees.onContextMenuSelect(e);}},&quot;open&quot;:function(e){if(window.qwdleftPanel.leftPanelTrees.onContextMenuOpen){window.qwdleftPanel.leftPanelTrees.onContextMenuOpen(e);}},&quot;target&quot;:&quot;#qwd-ff-treeview&quot;,&quot;filter&quot;:&quot;.k-in&quot;});});



	








    
	kendo.syncReady(function(){jQuery(&quot;#ig-newfolder-window-qwd-new-folder-dialog&quot;).kendoWindow({&quot;open&quot;:newFolderDialog.onNewFolderDialogOpen,&quot;activate&quot;:newFolderDialog.onNewFolderDialogActivate,&quot;modal&quot;:true,&quot;iframe&quot;:false,&quot;draggable&quot;:true,&quot;scrollable&quot;:true,&quot;pinned&quot;:false,&quot;title&quot;:&quot;NEW Folder&quot;,&quot;resizable&quot;:false,&quot;width&quot;:572,&quot;actions&quot;:[&quot;Close&quot;]});});










</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;qwd-splitter-left-pane&quot;)</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/Page_FAQ - Visual Studio Team Servi/iframe_externalContentHost4</value>
   </webElementProperties>
</WebElementEntity>
