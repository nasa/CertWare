# CertWare Workbench

## Overview

CertWare is a collection of tools intended to support the development
of safety, assurance, or dependability cases.  CertWare adopts several
types of structured argument models and provides an implementation of
tools to support writing and verifying arguments using the chosen
model.  The implementations are a baseline meant to be enhanced and
further integrated into development tools chains.  The workbench includes textual, semi-structured text, semi-structured tree, and graphical editors.
The workbench implementation is done in and for Eclipse,
as a large collection of Eclipse plugins and features, using
several model generation tools to facilitate implementation and
maintenance.  See the Meta-Models section below for the kinds of
models already incorporated into the workbench.

CertWare provides some prototype contributions for project management
metrics (metrics about the case argument structure), and project
planning (time and resources for case production).  It provides a
novel approach to argument production using semi-formal proofs.  It provides a novel approach to logical argument analysis using semi-structured text together with an answer set solver to analyze the argument.  It provides modeling tools for producing fault trees from physical system descriptions.  

CertWare is meant to be extended into other tool chains and other
aspects of the assurance lifecycle, so feel free to extend it in any
direction you see fit.


## Documentation

Documentation is stashed throughout the project workspace.  See the
net.certware.doc- project in particular.  A version history is
maintained in ```net.certware.doc/wiki/versions.textile``` for convenient
export to other formats.  The latest run of Javadoc usually is found
in ```net.certware.doc/javadoc```.  The project design and build notes are
in ```net.certware.doc/wiki/project.textile```.

## Meta-Models

The following tags are associated with the many meta-models used in
the workbench.  We use these liberally throughout the models, plugin
names, and editor file extension associations.  

* **CAE** Claim-argument-evidence notation metamodel.
* **CPN** A CertWare-specific Planning Notation metamodel.  
* **EUR** EUROCONTROL variant of the CAE notation.
* **GSN** Goal structuring notation using OMG metamodel.
* **HEV** Evidence settings for Hugin Bayesian networks.
* **INTENT** An intent specification DSL model for design and hazard support.
* **L** CertWare L argumentation language and analyzer.
* **MSPDI** The MSPDI schema from Microsoft Project.
* **NET** Hugin Network models.
* **SA** State Analysis metamodel based on the JPL mission data system approach to performing state analysis and elaboration.
* **SACM** OMG's structured assurance case metamodel and its Ecore
  implementation.  Textual DSLs use extension ```sacmdsl``` and graphical
  diagrams will maintain two models -- the ```sacm``` model and the
  ```diagram``` model.
* **SAEM** OMG's structured argument evidence metamodel and its Ecore implementation.
* **SCO** A CertWare-specific software change order metamodel.
* **SFP** A semi-formal proof metamodel derived from an Xtext grammar for these proofs.
* **SMM** OMG software measurement metamodel and its Ecore implementation.
* **SPM** A CertWare-specific software project management metrics metamodel.
* **STATE** A state specification DSL to support intent specification DSL.  
* **STPA** A DSL for systems-theoretic process analysis.  
* **VCL** A verification checklist generic metamodel.


## Eclipse Dependencies

The following Eclipse product dependencies are needed for the given reasons:

* **EEF**. We use the extended editing framework to generate better
  property sheets for the model editors.  The EEF model usually is
  found in the associated ```edit``` plugin and we use the EEF framework
  to generate the needed parts.  Be sure to update plugin extensions
  when making design changes. See the ```project.textile``` file for notes
  on running the EEF tools.
* **Epsilon**.  We use the Epsilon tools for model validation rules.  
* **Xtext**.  We use Xtext DSLs for some new notations.  See the
  ```project.textile``` file for notes on running the Xtext tools.
* **ATL**.  We use the Atlas transformation tools to convert models of
  one type into models of another type.  See the ```project.textile```
  file for notes on running the Atlas tools.

## Eclipse Design

The majority of CertWare design is done with the EMF, Ecore, and
Xtext.  We described several metamodels and then generated the plugins
to support them.  Afterward in many cases we added navigator
contributions, help, validators, integrations, and other functional
content.  The notes here and in the ```project.textile``` file provide
more details.

### File Names and Extensions

* ```*.cae``` Claim-argument-evidence files.
* ```*.caz``` Claim-argument-evidence diagram files.
* ```*.eur``` EUROCONTROL notation files.
* ```*.euz``` EUROCONTROL notation diagram files.
* ```*.gsn``` GSN goal structuring notation files.
* ```*.gsz``` GSN goal structuring notation diagram files.
* ```*.hev``` Hugin evidence setting model files
* ```*.intent``` Intent specification DSL files
* ```*.l``` CertWare L language input files.
* ```*.mspdi``` and ```*.mpx``` are Microsoft Project (MSPDI) model files
* ```*.net``` and ```*.hugin``` Hugin NET files
* ```*.result``` CertWare L language solved analysis result files.
* ```*.sacm``` SACM model files
* ```*.sacmd``` SACM DSL model files
* ```*.sad``` State analysis diagram files
* ```*.sco``` SCO change order model files
* ```*.smm``` OMG Software Measurement Metamodel files
* ```*.spm``` Software Project Management metrics files
* ```*.state``` State specification DSL model files
* ```*.stateanalysis``` State analysis model files
* ```*.stpa``` STPA DSL model files
* ```*.vcl``` Verification checklist model files

### Editors

Several editors are contributed by the EMF generator models. There are
a few textual editors contributed by the Xtext generator models.

### Views

* ```net.certware.evidence.hugin.view``` Contributes a view for Bayesian
  Network model files in the Hugin format, including SamIam engine
  analysis and results presentations.  Responds only to workbench
  resource selections.  Provides analysis commands for operations on
  these models, and provides a summary of analysis results within the
  view.  Provides for evidence storage and recovery using a separate
  metamodel.
* ```net.certware.measurement.sco.view``` Contributes a view for SCO model
  files.  Responds to both resource and object workbench selections.
  Master-detail view on the artifact list items.  Uses the
  EMF-generated item provider adapter factory to populate the master
  tree.
* ```net.certware.measurement.spm.view``` Contributes a view for SPM model
  files.  Responds to both resource and object workbench selections.
  Master-detail view on the artifact list items.  Uses a local content
  and label provider because the model is generated by Xtext which
  does not product an item provider factory and because we do not want
  the full tree exposed for this view.
* ```net.certware.planning.cpn.view``` Contributes a view for CPN model
  files.  Responds to both resource and object workbench selections.
  Master-detail view on the artifact list items.  Employs made-up
  adapter factory for item provider adapters so the Xtext injected
  model providers are not available in the view, instead uses the EMF
  reflective providers.
* ```net.certware.verification.checklist.view``` Contributes a view for
  VCL model files.  Provides buttons for setting checklist item values
  and for saving updated models.

### Navigator Contributions

* ```net.certware.argument.arm.navigator``` Contributes content on ARM
  model resource files and navigator filter.
* ```net.certware.argument.cae.navigator``` Contributes content on CAE
  model resource files and navigator filter.
* ```net.certware.argument.gsn.navigator``` Contributes content on GSN
  model resource files and navigator filter.
* ```net.certware.argument.eur.navigator``` Contributes content on EUR
  model resource files and navigator filter.
* ```net.certware.argument.sfp.navigator``` Contributes content on SFP
  model resource files and navigator filter.
* ```net.certware.sacm.navigator``` Contributes content on SACM model
  resource files and navigator filter.
* ```net.certware.measurement.sco.navigator``` Contributes content on SCO
  model resource files and navigator filter.
* ```net.certware.measurement.spm.navigator``` Contributes content on SPM
  model resource files and navigator filter.
* ```net.certware.planning.cpn.navigator``` Contributes content on CPN
  model resource files and navigator filter.
* ```net.certware.verification.checklist.navigator``` Contributes VCL
  content on verification checklist files and navigator filter.

### Plugins Summary

* ```net.certware.argument.analysis.*``` Output handlers for the L language solvers. This includes a grammar definition in Xtext and its generated edit model and editor, although we use it only for reading the output of the built-in L solvers.  Fragments provide executable solvers for certain platforms.  
* ```net.certware.argument.arm.*``` Argument model and editor support for OMG ARM.  The core plugin contains the model definition and generator.  The edit plugin contains the extended editing framework support models.  The editor plugin is modified to use extended editing features for property specification.  
* ```net.certware.argument.arm.help``` Help content for ARM models and related workbench contributions.    
* ```net.certware.argument.cae.*``` Argument model and editor support for CAE (ASCAD), built on ARM.  The core plugin contains the model definition and generator.  The edit plugin contains the extended editing framework support models.  The editor plugin is modified to use extended editing features for property specification.
* ```net.certware.argument.cae.help``` Help content for CAE models and related workbench contributions.
* ```net.certware.argument.caz.*``` Argument diagram graphical model equivalent for CAE models.    
* ```net.certware.argument.eur.*``` Argument model and editor support for EUROCONTROL notation, built on ARM.  The core plugin contains the model definition and generator.  The edit plugin contains the extended editing framework support models.  The editor plugin is modified to use extended editing features for property specification.
* ```net.certware.argument.eur.help``` Help content for EUROCONTROL models and related workbench contributions.    
* ```net.certware.argument.euz.*``` Argument diagram graphical model equivalent for EUROCONTROL models.    
* ```net.certware.argument.gsn.*``` Argument model and editor support for GSN, built on ARM.  The core plugin contains the model definition and generator.  The edit plugin contains the extended editing framework support models.  The editor plugin is modified to use extended editing features for property specification.
* ```net.certware.argument.gsn.help``` Help content for GSN models and related workbench contributions.  
* ```net.certware.argument.gsz.*``` Argument diagram graphical model equivalent for GSN models.
* ```net.certware.argument.language.*``` Input editor for the L language for argumentation using semi-structured text.  We provide a grammar for Xtext and use the modeling tools to produce the edit model and user interface.  We provide additional features for validation and context-sensitive editor improvements such as type support.  The saved L argument file should be sent to an L solver as provided in the analysis plugins.  
* ```net.certware.argument.sfp.*``` Semi-formal proof structured text argument models.  The core plugin contains the model definition and generator.  The edit plugin contains the extended editing framework support models.  The editor plugin is modified to use extended editing features for property specification.
* ```net.certware.branding``` Project branding plugin for feature definition.
* ```net.certware.core``` Core project content.
* ```net.certware.core.ui``` Core project UI content including extension bases.  Includes interface constants files applying across the project source base.  
* ```net.certware.doc``` General project to contain various documentation files including the wiki.
* ```net.certware.evidence.hugin.*``` Hugin NET DSL definition and generation.
* ```net.certware.evidence.hugin.instance.*``` Hugin NET evidence model definition and generation.
* ```net.certware.evidence.hugin.view.*``` SamIam analysis view using Hugin NET model files.
* ```net.certware.evidence.saem.*``` Evidence model and editor support for SAEM from OMG. The core plugin contains the model definition and generator.  The edit plugin contains the extended editing framework support models.  
* ```net.certware.example``` Example wizard and host plugin for contributing fragments.
* ```net.certware.export``` Exporting model resources to other formats.  
* ```net.certware.feature.*``` Feature packaging by core, argument style, and functionality features for update site publication.
* ```net.certware.hazard.*``` Basic hazard analysis metamodel and editor with supporting plugins.  
* ```net.certware.hazard.stpa.*``` Extensions to the hazard analysis to support the Leveson STPA approach to analysis.  Uses an STPA DSL as created by CertWare and rendered in Xtext.
* ```net.certware.help``` Project help files, cheat sheets and dynamic context support.
* ```net.certware.history.*``` History contributions for version control analysis.
* ```net.certware.intent.*``` Intent specification DSL and supporting plugins.
* ```net.certware.intent.state.*``` Intent state specification DSL and supporting plugins.
* ```net.certware.launch``` Launch configuration shared files.
* ```net.certware.libs.doc``` Plugin packaging of docx4J 2.5 libraries.
* ```net.certware.lib.inference``` Plugin packaging of UCLA SamIam inference library.
* ```net.certware.libs.poi``` Plugin packaging of Apache POI 3.6 libraries.
* ```net.certware.measurement.sco.*``` Software change order model and editor support.  Supports the SPM metrics.  Other collectors can be added for different metrics suites.  The editor plugin is modified to use extended editing features for property specification.
* ```net.certware.measurement.smm.*``` Measurement model and editor support the OMG SMM.  The core plugin contains the model definition and generator.  The edit plugin contains the extended editing framework support models.  The editor plugin is modified to use extended editing features for property specification.
* ```net.certware.measurement.spm.*``` Software product management metrics model and editor support for Royce SPM metrics.  Uses the SMM metamodel.
* ```net.certware.planning.cpn.*``` A planning content DSL serving as a project management data overlay on argument models.
* ```net.certware.planning.mspdi.*``` Planning content model using Microsoft project data schema. The Microsoft MSPDI schema was coerced into an Ecore model, then the EMF plugins generated from this model.    
* ```net.certware.product``` Product definition for stand-alone application.
* ```net.certware.sacm.*``` Object model and editor support for OMG's SACM.  
* ```net.certware.state.*``` State analysis metamodel, tree editor, and graphical editor support and supporting plugins.  
* ```net.certware.stpa.*``` STPA DSL definition and supporting plugins.
* ```net.certware.target``` CertWare project target definition.
* ```net.certware.update``` Update site definition project (currently unused).
* ```net.certware.verification.checklist.*``` Verification model and editor support for generic check lists. The core plugin contains the model definition and generator.  The edit plugin contains the extended editing framework support models.  The editor plugin is modified to use extended editing features for property specification.
* ```net.certware.verification.checklist.view``` Verification model checklist view with update support.  


### Target Platform

* Eclipse Mars or later
* Eclipse Epsilon features
* Eclipse Extended Editing Framework
* Eclipse Grapjhical Modeling Framework
* Eclipse Graphiti
* Eclipse Xtext Framework
* Eclipse RCP delta pack for multi-platform exports


## Packaging

The CertWare plug-ins and fragments can be delivered in a variety of
ways, including simply exporting projects to the file system.

### Delivery as a Feature

The several ```net.certware.*``` plug-ins and fragments (not including the
testing fragments) are combined into several features and a single
category definition.  Use the automated dependency calculation of the
feature editors to identify the installation dependencies, then ensure
there are no spurious plug-ins identified; if so, identify the source
and repair the issue.  For complete feature deliveries, use the
version tool in the feature editor to push the feature version
identifier into the plugins and fragments.  Export to either a folder
or archive file.  There are no platform-dependent requirements.  There
are several features available, each bundling distinct functionality
and identifying dependencies if necessary.  All features use the
```core``` feature for shared functionality.

* ```net.certware.feature``` Core feature used by all other features,
  providing logging, extensions, and other basic functionality.
* ```net.certware.feature.bayes``` Support for Bayesian models of evidence.
* ```net.certware.feature.check``` Support for verification checklists.
* ```net.certware.feature.intent``` Support for intent and state specifications.
* ```net.certware.feature.measure``` Support for measurement collection and metrics.
* ```net.certware.feature.planning``` Support for time and resource planning notation.
* ```net.certware.feature.sacm``` Support for SACM arguments and evidence.
* ```net.certware.feature.stpa``` Support for STPA models.
* ```net.certware.feature.sfp``` Support for semi-formal proof arguments.

To use the delivery, import the desired features into an existing
Eclipse workbench installation.  The installer will identify missing
dependencies if any and prompt the user to install these
prerequisites.  The features and contents are not digitally signed.
After installation, restart the workbench to update the commands and
workbench parts.

### Delivery as a Product

The project ```net.certware.product``` provides a product definition and
p2 configuration.  This product uses all of the plugins and the basic
workbench configuration.  This configuration is not expected to be the
preferred method of delivery owing to the variety of user platforms,
but it can be used to build initial installation packaging for later
update via update sites. The preferred method is to first install some
version of Eclipse for the user's platform, and then install CertWare
features from update sites.  CertWare has no platform-specific
dependencies.


## Publishing

To prepare an update site for publishing, first regenerate the latest
features as described above from the ```net.certware.feature``` project.
Afterward go to the update site project at ```updatesite2016xxxx``` or
```net.certware.feature.updatesite``` and open the ```site.xml``` definition
file.  Use the site definition editor to add the new features with
their updated version identifier.  Click **Build All** to build the update
site.  The resulting update site is usable in the remote and local
repositories, when pushed back to GitHub, or when copied say to an
AWS S3 location for other users.

At this writing there are two ways to use the update site:

* Install from the local copy of the repository. In this case add a
  software installation site using the Eclipse software install dialog
  to point to the local repository and the
  ```net.certware.feature.updatesite``` folder.
* Install from the Amazon S3 copy.  In this case add a software
  installation site using the Eclipse software install dialog to point
  to the S3 repository at ```http://certware-update.s3.amazonaws.com```.
  Note that this copy is likely of an older version of the features
  than what is found in the GitHub repository, and that updating this
  copy requires Kestrel Technology accounts to update at Amazon.

It used to be the case we could use GitHub's raw tree paths to support update site delivery, but its subsequent limitations to file size have prevented successful delivery in recent times.

## Not Included

Certain model exports were once supported using the Apache POI
libraries.  Owing to the government's uneasiness over the derived license terms we have removed these for the NASA deliveries.  We may reinstate these later under a different license.


## License

See the license files for the original and updated contributions.  The
initial release of CertWare to open source is given by the NASA Open
Source Agreement and third-party licenses including Apache 2.0.

Copyright (c) 2011-2016 United States Government as represented by the
Administrator for The National Aeronautics and Space Administration.
All Rights Reserved.
